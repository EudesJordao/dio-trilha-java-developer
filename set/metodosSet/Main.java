package set.metodosSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Crie um set

        //Set<Double> notas = new HashSet<>();
        //notas.add(1d);

        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        //confira se a nota 5 está no conjunto
        System.out.println(notas.contains(5d));

        //Exiba a menor nota
        System.out.println(Collections.min(notas));

        //Exiba a maior nota
        System.out.println(Collections.max(notas));

        //Exiba a soma de todos os números
        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println(soma);

        //Exiba a média
        System.out.println(soma / notas.size());

        //Remova a nota 0
        notas.remove(0d);

        //Remova as notas menores que 7
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        //Exiba todas as notas na ordem que foram inseridas
        Set<Double> notasLinked = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notasLinked);

        //Exiba todas as notas na ordem crescente
        Set<Double> notasTree = new TreeSet<>(notasLinked);
        System.out.println(notasTree);

        //Apague todos o números do conjunto
        notas.clear();

        //Veja se esta vazio
        notas.isEmpty();
    }
}
