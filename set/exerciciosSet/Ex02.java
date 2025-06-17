package set.exerciciosSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
        Linguagem l1 = new Linguagem("Java", "Int", 2001);
        Linguagem l2 = new Linguagem("JavaScript", "Vs", 2014);
        Linguagem l3 = new Linguagem("PHP", "Vs", 2002);

        Set<Linguagem> linguagems = new LinkedHashSet<>(Arrays.asList(l1,l2,l3));

        System.out.println(linguagems);



    }
}


