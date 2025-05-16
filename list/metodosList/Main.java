package list.metodosList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //crie uma lista e add 4 notas;
        List<Double> notas = new ArrayList<>();
        notas.add(7.1);
        notas.add(2.1);
        notas.add(5.5);
        notas.add(1.9);
        System.out.println(notas);

        //exiba a nota 2.1;

        System.out.println(notas.indexOf(2.1));

        //add a nota 8 na posição 3;

        notas.add(3, 8d);
        System.out.println(notas);

        //substitua a nota 2.1 pela nota 7;

        notas.set(notas.indexOf(2.1), 7d);

        //confira se nota 7 esta na lista
        System.out.println(notas.contains(7d));

        //exiba a lista uma abaixo da outra
        //for(Double nota : notas) System.out.println(nota);

        //exiba a terceira nota add
        System.out.println(notas.get(1));

        //exiba a menor nota
        System.out.println(Collections.min(notas));

        //exiba a maior nota
        System.out.println(Collections.max(notas));

        //soma das notas
        Iterator<Double> iteratored = notas.iterator();
        Double soma = 0d;
        while (iteratored.hasNext()){
            Double next = iteratored.next();
            soma += next;
        }
        System.out.println(soma);

        //media
        System.out.println(soma/notas.size());

        //remova a nota 1.9

        notas.remove(1.9);
        System.out.println(notas);

        //remova notas menores que 7
        for (Double nota: notas){
            if (nota < 7){
                notas.remove(nota);
            }
        }

        System.out.println(notas);

        //apague toda a lista
        notas.clear();
        System.out.println(notas);

        //veja se ta vazia
        System.out.println(notas.isEmpty());



    }
}
