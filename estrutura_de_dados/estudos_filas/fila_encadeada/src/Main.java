package estrutura_de_dados.estudos_filas.fila_encadeada.src;

import estrutura_de_dados.estudos_filas.fila_encadeada.src.one.digitalInovation.ListaEncadeada;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("Teste 1");
        minhaListaEncadeada.add("Teste 2");
        minhaListaEncadeada.add("Teste 3");
        minhaListaEncadeada.add("Teste 4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(2));
        System.out.println(minhaListaEncadeada);

    }
}