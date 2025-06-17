package set.exerciciosSet;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Set<String> arcoiris = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

        for(String cor: arcoiris) System.out.println(cor);
        System.out.println(arcoiris.size());

        Set<String> arcoirisTree = new TreeSet<>(arcoiris);
        System.out.println(arcoirisTree);

        Set<String> arcoirisLinked = new LinkedHashSet<>(arcoiris);
        System.out.println(arcoirisLinked);
        String[] array = new String[arcoirisLinked.size()];
        int index = 0;
        for (String cor : arcoirisLinked){
            array[index] = cor;
            index++;
        }
        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
        System.out.println("------");
        for(int i = 0; i < array.length; i++){
            if(array[i].contains("V")){
                System.out.println(array[i]);
                arcoirisLinked.remove(array[i]);
            }
        }
        System.out.println(arcoirisLinked);
    }
}

