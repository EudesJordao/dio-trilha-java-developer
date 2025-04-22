package estrutura_de_dados.estudos_filas.fila_duplamente_encadeada.src.one.digitalInovation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return this.tamanhoLista;
    }

    public NoDuplo<T> getNo(int index){
        validarIndex(index);
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < index-1) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoPosterior();
        }
        return noAuxiliar;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public void add(T conteudo){
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        tamanhoLista++;
        if (primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo.setNoPosterior(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void add(T conteudo, int index){
        validarIndex(index);
        NoDuplo<T> noAuxiliar = getNo(index);

        if (noAuxiliar.getNoPosterior() == null){
            add(conteudo);
        } else {
            NoDuplo<T> novoNo = new NoDuplo<>(conteudo);

            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.setNoPosterior(noAuxiliar);

            noAuxiliar.getNoAnterior().setNoPosterior(novoNo);
            noAuxiliar.setNoAnterior(novoNo);
            tamanhoLista++;

        }
    }

    public void remove(int index){
        validarIndex(index);
        NoDuplo<T> noAuxiliar = getNo(index);

        if (noAuxiliar.getNoAnterior() == null){
            primeiroNo = primeiroNo.getNoPosterior();
            if (primeiroNo.getNoPosterior() != null){
                primeiroNo.setNoAnterior(null);
            }
        } else if (noAuxiliar.getNoPosterior() != null){
            noAuxiliar.getNoPosterior().setNoAnterior(noAuxiliar.getNoAnterior());
            noAuxiliar.getNoAnterior().setNoPosterior(noAuxiliar.getNoPosterior());
        } else {
            noAuxiliar.getNoAnterior().setNoPosterior(null);
            ultimoNo = noAuxiliar.getNoAnterior();
        }
        tamanhoLista--;
    }

    public void validarIndex(int index){
        if (index > tamanhoLista){
            throw new IndexOutOfBoundsException("Index maior que o tamnho da lista!");
        }
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; i < size(); i++){
            strRetorno += "[No {conteúdo=" + noAuxiliar.getConteudo() + " }] ==>";
            noAuxiliar = noAuxiliar.getNoPosterior();
        }
            strRetorno += noAuxiliar;
        return strRetorno;
    }
}
