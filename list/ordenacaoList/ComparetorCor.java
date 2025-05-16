package list.ordenacaoList;

import java.util.Comparator;

public class ComparetorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}
