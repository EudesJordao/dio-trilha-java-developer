package one.digitalInnovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar =  refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public void pop(){
        if (!isEmpty()){
            No noPoped = refNoEntradaPilha.getRefNo();
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        }
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }


    @Override
    public String toString() {
        String stringRetorno =  "-------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno = "------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno +=  "[No{dado = " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "============";

        return  stringRetorno;
    }
}
