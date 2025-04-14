import one.digitalInovation.ListaCircular;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> lista = new ListaCircular<>();

        lista.add("c1");
        lista.add("c2");
        lista.add("c3");
        lista.add("c4");
        lista.add("c5");
        lista.add("c6");

        System.out.println(lista);

        lista.remove(5);

        System.out.println(lista);


    }
}