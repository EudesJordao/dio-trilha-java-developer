package set.exerciciosSet;

import java.util.Comparator;

public class Compador  implements Comparator<Linguagem> {
    @Override
    public int compare(Linguagem o1, Linguagem o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if(nome != 0) return nome;
        int ide = o1.getIde().compareTo(o2.getIde());
        if(ide != 0) return ide;
        return Integer.compare(o1.getAno(), o2.getAno());
    }
}
