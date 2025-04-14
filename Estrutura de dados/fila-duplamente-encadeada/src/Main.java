import one.digitalInovation.ListaDuplamenteEncadeada;
import one.digitalInovation.NoDuplo;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("c1");
        lista.add("c2");
        lista.add("c3");
        lista.add("c4");
        lista.add("c5");
        

        System.out.println(lista);

    }
}