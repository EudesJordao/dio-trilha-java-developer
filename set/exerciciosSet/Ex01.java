package set.exerciciosSet;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Set<String> arcoiris = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

        for(String cor: arcoiris) System.out.println(cor);
        System.out.println("------");
        System.out.println(arcoiris.size());

        System.out.println("------");
        Set<String> arcoirisTree = new TreeSet<>(arcoiris);
        System.out.println(arcoirisTree);

        System.out.println("------");
        Set<String> arcoirisLinked = new LinkedHashSet<>(arcoiris);
        List<String> reverse = new ArrayList<>(arcoirisLinked);

        Collections.reverse(reverse);

        System.out.println(reverse);

        System.out.println("------");

        for(String cor : reverse){
            if(cor.toLowerCase().startsWith("v")){
                System.out.println(cor);
                arcoirisLinked.remove(cor);
            }
        }
        System.out.println("------");

        System.out.println(arcoirisLinked);
    }
}

