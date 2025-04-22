package estrutura_de_dados.estudos_filas.fila.src;

import estrutura_de_dados.estudos_filas.fila.src.one.digitalInovation.Fila;

public class Main {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();

        fila.enqueue("primeiro");
        fila.enqueue("segundo");
        fila.enqueue("terceiro");
        fila.enqueue("quarto");
        fila.enqueue("quinto");



        fila.dequeue();

        System.out.println(fila);

    }
}