package set.ordenacaoSet;

import java.rmi.ServerError;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Exiba em ordem aleatória
        Set<Serie> seriesHash = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

//        for(Serie s : seriesHash) System.out.println(s);

        //Exiba em ordem natural
        Set<Serie> seriesTree = new TreeSet<>(seriesHash);

//        for(Serie s : seriesTree) System.out.println(s);

        //Exiba em ordem dos atributos
        Set<Serie> serieTree = new TreeSet<>(new Compar());
        serieTree.addAll(seriesHash);
        for(Serie s : serieTree) System.out.println(s);


    }
}
