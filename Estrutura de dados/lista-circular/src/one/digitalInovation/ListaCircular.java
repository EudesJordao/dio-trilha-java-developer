package one.digitalInovation;

public class ListaCircular<T> {

    private No<T> calda;
    private No<T> cabeca;
    private int tamanhoLista;

    public ListaCircular() {
        this.calda = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanhoLista == 0){
            this.calda = novoNo;
            this.cabeca = calda;
            this.cabeca.setProximoNo(cabeca);
        } else {
            novoNo.setProximoNo(this.calda);
            this.calda = novoNo;
            this.cabeca.setProximoNo(this.calda);
        }
        this.tamanhoLista++;
    }


    public void remove(int index){
        No<T> noRemovido = getNo(index);
        if (index == tamanhoLista-1 && this.tamanhoLista > 1){
            No<T> noAnterior = getNo(index - 1);
            noRemovido.setProximoNo(null);
            noAnterior.setProximoNo(this.calda);
        } else if (this.tamanhoLista == 1) {
            this.calda = null;
        } else if (index == 0){
            this.calda = noRemovido.getProximoNo();
            this.cabeca.setProximoNo(this.calda);
        } else {
            No<T> noAnterior = getNo(index - 1);
            noAnterior.setProximoNo(noRemovido.getProximoNo());
        }
    }

    public No<T> getNo(int index){
        validarIndex(index);
        No<T> noAuxiliar = this.calda;

        if (index == this.tamanhoLista-1){
            return this.cabeca;
        } else {
            for (int i = 0; i < index; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
        }

        return noAuxiliar;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }


    public int size(){
        return this.tamanhoLista;
    }

    public void validarIndex(int index){
        if (index > this.tamanhoLista){
            throw new IndexOutOfBoundsException("Valor maior que a lista!");
        }
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    @Override
    public String toString() {
       String strRetorno = "";
       No<T> noAuxiliar = this.calda;

       for (int i = 0; i < this.tamanhoLista; i++){
           strRetorno += "[Conteúdo = " + noAuxiliar.getConteudo() + "] ===>";
           noAuxiliar = noAuxiliar.getProximoNo();
       }
       strRetorno += noAuxiliar.getConteudo();

       return strRetorno;
    }
}
