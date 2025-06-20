package map.ordenacaoMap;

import java.util.Comparator;
import java.util.Map;

public class Comparador implements Comparator<Map.Entry<String, Livros>> {

    @Override
    public int compare(Map.Entry<String, Livros> o1, Map.Entry<String, Livros> o2) {
        return o1.getValue().getNome().compareTo(o2.getValue().getNome());
    }
}
