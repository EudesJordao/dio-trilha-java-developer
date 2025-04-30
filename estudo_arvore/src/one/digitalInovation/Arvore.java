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


    public void exibirInOrdem(){
        System.out.println("Exibindo em ordem");
        exibirInOrdem(this.noRaiz);
    }

    private void exibirInOrdem(NoBinario<T> noAtual){
        if (noAtual != null){
            exibirInOrdem(noAtual.getNoEsq());
            System.out.print(noAtual.getConteudo() + ", ");
            exibirInOrdem(noAtual.getNoDir());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("Exibindo em ordem");
        exibirPosOrdem(this.noRaiz);
    }

    private void exibirPosOrdem(NoBinario<T> noAtual){
        if (noAtual != null){
            exibirPosOrdem(noAtual.getNoEsq());
            exibirPosOrdem(noAtual.getNoDir());
            System.out.print(noAtual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("Exibindo em ordem");
        exibirPreOrdem(this.noRaiz);
    }

    private void exibirPreOrdem(NoBinario<T> noAtual){
        if (noAtual != null){
            System.out.print(noAtual.getConteudo() + ", ");
            exibirPreOrdem(noAtual.getNoEsq());
            exibirPreOrdem(noAtual.getNoDir());
        }
    }


    public void remover(T conteudo){
        try {
            NoBinario<T> atual = this.noRaiz;
            NoBinario<T> pai = null;
            NoBinario<T> filho = null;
            NoBinario<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                } else{
                    atual = atual.getNoDir();
                }
            }

            if (atual == null){
                System.out.println("Conteudo não encontrado. Bloco Try ");
            }
            
            if (pai == null){
                if (atual.getNoDir() == null){
                    this.noRaiz = atual.getNoEsq();
                }else if (atual.getNoEsq() == null){
                    this.noRaiz = atual.getNoDir();
                }else{
                    for (temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq())
                    {
                        if (filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(this.noRaiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(this.noRaiz.getNoDir());
                    this.noRaiz = filho;
                }
            } else if (atual.getNoDir() == null) {
                if (pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null) {
                if (pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());
                }
            } else{
                for (
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                ){
                    if (filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }
            }

        } catch (NullPointerException erro){
            System.out.println("Conteudo não encontrado. Bloco Catch " + erro);
        }
    }

}
