package map.ordenacaoMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Livros> colecao = new HashMap<>(){{
            put("Hawking, Stephen" , new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles" , new Livros("O Poder do Hábito", 408));
            put("Harari, Yuval Noah" , new Livros("21 Lições Para o Século 21", 432));
        }};

        System.out.println(colecao);

        Map<String, Livros> colecaoLinked = new LinkedHashMap<>(){{
            put("Hawking, Stephen" , new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles" , new Livros("O Poder do Hábito", 408));
            put("Harari, Yuval Noah" , new Livros("21 Lições Para o Século 21", 432));
        }};

        System.out.println(colecaoLinked);

        Map<String, Livros> colecaoTree = new TreeMap<>(colecao);
        System.out.println(colecaoTree);

        Set<Map.Entry<String, Livros>> colecaoSet = new TreeSet<>(new Comparador());
        colecaoSet.addAll(colecao.entrySet());

        System.out.println(colecaoSet);



    }
}
