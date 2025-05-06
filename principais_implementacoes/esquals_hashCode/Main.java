package principais_implementacoes.esquals_hashCode;

import principais_implementacoes.esquals_hashCode.one.digitalInovation.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Renault"));
        listaCarros.add(new Carro("Volkswagen"));
        listaCarros.add(new Carro("BYD"));

        System.out.println(listaCarros.get(1).hashCode());
        System.out.println(listaCarros.get(0).hashCode());
        System.out.println(listaCarros.get(2).hashCode());
        System.out.println(listaCarros.get(3).hashCode());
    }
}
