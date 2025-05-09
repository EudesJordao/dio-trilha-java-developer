package estrutura_de_dados.estudos_filas.fila_duplamente_encadeada.src.one.digitalInovation;

public class NoDuplo<T> {
    private T conteudo;
    private NoDuplo<T> noAnterior;
    private NoDuplo<T> noPosterior;

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
        this.noPosterior = null;
        this.noAnterior = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoPosterior() {
        return noPosterior;
    }

    public void setNoPosterior(NoDuplo<T> noPosterior) {
        this.noPosterior = noPosterior;
    }

    public NoDuplo<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplo<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
