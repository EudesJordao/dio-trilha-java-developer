package set.exerciciosSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 {
    public static void main(String[] args) {
        Linguagem l1 = new Linguagem("Java", "Int", 2001);
        Linguagem l2 = new Linguagem("JavaScript", "Vs", 2014);
        Linguagem l3 = new Linguagem("PHP", "Vs", 2002);

        Set<Linguagem> linguagemsLinked = new LinkedHashSet<>(Arrays.asList(l2,l1,l3));

        System.out.println(linguagemsLinked);

        Set<Linguagem> linguagemSet = new TreeSet<>(linguagemsLinked);
        for(Linguagem l : linguagemSet) System.out.println(l);

        Set<Linguagem> linguagemTree = new TreeSet<>(new Compador());
        linguagemTree.addAll(linguagemsLinked);
        System.out.println(linguagemTree);


    }
}


