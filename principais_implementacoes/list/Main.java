package principais_implementacoes.list;

import principais_implementacoes.list.digitalInovation.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> carroList = new ArrayList<>();

        carroList.add(new Carro("Ford"));
        carroList.add(new Carro("Chevrolet"));
        carroList.add(new Carro("Fiat"));
        carroList.add(new Carro("Peugeot"));

        System.out.println(carroList.add(new Carro("Ford")));
        System.out.println(carroList.get(2));
        System.out.println(carroList.remove(2));
        System.out.println(carroList.indexOf(new Carro("Ford")));
        System.out.println(carroList);
    }
}
