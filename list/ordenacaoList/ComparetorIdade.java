package list.ordenacaoList;

import java.util.Comparator;

public class ComparetorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        if (o1.getIdade() < o2.getIdade()){
            return 1;
        } else if (o1.getIdade() > o2.getIdade()) {
            return -1;
        }
        return 0;
    }
}
