package estrutura_de_dados.estudos_filas.fila_encadeada.src.one.digitalInovation;


public class ListaEncadeada<T> {

    private No<T> referenciaNoEntrada;


    private No<T> getNo(int index){
        validarIndex(index);
        No<T> noAuxiliar = referenciaNoEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T get(int index){
        validarIndex(index);
        return getNo(index).getConteudo();
    }


    public T remove(int index){
        validarIndex(index);
        No<T> noPivor = this.getNo(index);
        if (index == 0) {
            referenciaNoEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        No<T> noAuxiliar = referenciaNoEntrada;
        if (isEmpty()){
            this.referenciaNoEntrada = novoNo;
        } else {
            for (int i = 0; i < this.size()-1; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
             noAuxiliar.setProximoNo(novoNo);
        }
    }

    public int size(){
        int tamanhoNo = 0;
        No<T> noAuxiliar = referenciaNoEntrada;

        while (true){
            if (noAuxiliar != null){
                tamanhoNo++;
                if (noAuxiliar.getProximoNo() != null){
                    noAuxiliar = noAuxiliar.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return tamanhoNo;
    }

    private void validarIndex(int index){
        int ultimoIndex = size()-1;

        if (index >= size()){
            throw new IndexOutOfBoundsException("Valor maior que a lista!" + ultimoIndex );
        }
    }

    public boolean isEmpty(){
        return referenciaNoEntrada == null ? true : false;
    }

    @Override
    public String toString() {

        String strRetorno =  "";
        No<T> noAuxiliar  = referenciaNoEntrada;
        for (int i = 0; i < size(); i++){
            strRetorno += "No{Conteúdo=" + noAuxiliar.getConteudo() + "} ======>";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += noAuxiliar;
         return strRetorno;

    }
}
