package list.ordenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato(22, "preto", "José"));
            add(new Gato(21, "Amarelo", "Link"));
            add(new Gato(23, "branco", "Estrela"));
        }};

        //ordem de inserção
        System.out.println(gatos);

        //ordem aleatória
        Collections.shuffle(gatos);
        System.out.println(gatos);

        //ordem natural
        Collections.sort(gatos);
        System.out.println(gatos);

        //ordem idade
        Collections.sort(gatos, new ComparetorIdade());
        System.out.println(gatos);

        //ordem cor
        Collections.sort(gatos, new ComparetorCor());
        System.out.println(gatos);

        //ordem cor/nome/idade
        Collections.sort(gatos, new ComparatorCorNomeIdade());
        System.out.println(gatos);
    }
}
