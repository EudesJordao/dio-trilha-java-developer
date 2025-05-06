package principais_implementacoes.set;

import principais_implementacoes.set.digitalInovation.Carro;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Carro> hashCarros = new HashSet<>();

        hashCarros.add(new Carro("Ford"));
        hashCarros.add(new Carro("Chevrolet"));
        hashCarros.add(new Carro("Fiat"));
        hashCarros.add(new Carro("Peugeot"));
        hashCarros.add(new Carro("Zip"));
        hashCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hashCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCarros);
    }
}
