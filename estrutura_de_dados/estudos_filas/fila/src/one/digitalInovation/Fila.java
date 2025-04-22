package estrutura_de_dados.estudos_filas.fila.src.one.digitalInovation;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){

        No firstNo = refNoEntradaFila;
        if (isEmpty()){
            return null;
        } else{
            while (true){
                if (firstNo.getRefNo() != null){
                    firstNo = firstNo.getRefNo();
                } else{
                    break;
                }
            }
        }
       return (T) firstNo.getObject();
    }

    public void dequeue(){
        if (!isEmpty()){
            No firstNo = refNoEntradaFila;
            No armazemNo = firstNo;
            while (true){
                if (firstNo.getRefNo() != null){
                    armazemNo = firstNo;
                    firstNo = firstNo.getRefNo();
                } else{
                    break;
                }
            }
            armazemNo.setRefNo(firstNo.getRefNo());
        }
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }


    @Override
    public String toString() {
        String stringRetorno =  "-------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno = "------------\n";

        No noAuxiliar = refNoEntradaFila;

        while (true){
            if (noAuxiliar != null){
                stringRetorno +=  "[No{dado = " + noAuxiliar.getObject() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "============";

        return  stringRetorno;
    }
}
