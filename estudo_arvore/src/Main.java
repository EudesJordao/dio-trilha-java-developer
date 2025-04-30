package estudo_arvore.src;

import estudo_arvore.src.one.digitalInovation.Arvore;
import estudo_arvore.src.one.digitalInovation.model.Obj;

public class Main {
    public static void main(String [] args){

        Arvore<Obj> arvore = new Arvore<>();

        arvore.inserir(new Obj(13));
        arvore.inserir(new Obj(10));
        arvore.inserir(new Obj(25));
        arvore.inserir(new Obj(2));
        arvore.inserir(new Obj(12));
        arvore.inserir(new Obj(20));
        arvore.inserir(new Obj(31));
        arvore.inserir(new Obj(29));

        arvore.exibirInOrdem();
        arvore.exibirPreOrdem();
        arvore.exibirPosOrdem();
    }
}
