package estudo_arvore.src.one.digitalInovation;

public class Arvore<T extends Comparable<T>> {

    private NoBinario<T> noRaiz;

    public Arvore(){
        this.noRaiz = null;
    }

    private NoBinario<T> inserir(NoBinario<T> atual, NoBinario<T> novoNo){
        if (atual == null){
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void inserir(T conteudo){
        NoBinario<T> novoNo = new NoBinario<>(conteudo);
        this.noRaiz = inserir(this.noRaiz, novoNo);
    }

}
