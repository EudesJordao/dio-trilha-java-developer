package estudo_arvore.src.one.digitalInovation;

public class NoBinario<T extends Comparable<T>> {
    private T conteudo;
    private NoBinario<T> noDir;
    private NoBinario<T> noEsq;

    public NoBinario(T conteudo) {
        this.conteudo = conteudo;
        this.noDir = this.noEsq = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoBinario<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(NoBinario<T> noDir) {
        this.noDir = noDir;
    }

    public NoBinario<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(NoBinario<T> noEsq) {
        this.noEsq = noEsq;
    }

    @Override
    public String toString() {
        return "NoBinario{" +
                "conteudo=" + conteudo +
                '}';
    }
}
