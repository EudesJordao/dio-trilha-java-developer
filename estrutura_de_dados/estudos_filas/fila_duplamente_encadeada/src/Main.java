package estrutura_de_dados.estudos_filas.fila_duplamente_encadeada.src;

import estrutura_de_dados.estudos_filas.fila_duplamente_encadeada.src.one.digitalInovation.ListaDuplamenteEncadeada;

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