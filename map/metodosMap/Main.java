package map.metodosMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Crie um dicionário
        Map<String, Double> carros = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.4);
            put("Mobi", 12.1);
            put("Hb20", 19.8);
        }};

        System.out.println(carros);

        //substitua o consumo do gol
        carros.put("Gol", 22d);
        System.out.println(carros);

        //ver se tem um valor
        System.out.println(carros.containsKey("gol"));

        //exiba o consumo do gol
        System.out.println(carros.get("gol"));

        //Exiba os modelos
        System.out.println(carros.keySet());

        //Exiba o consumo dos carros
        System.out.println(carros.values());

        //Pegar o carro mais econômico;
        Double consumoEconomico = Collections.max(carros.values());
        System.out.println();

        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String carroEconomico = "";
        for(Map.Entry<String, Double> entry: entries){
            if (entry.getValue().equals(consumoEconomico)){
                carroEconomico = entry.getKey();
            }
        }

        System.out.println(carroEconomico + " " + consumoEconomico);

        Double menosEconomico = Collections.min(carros.values());

        Set<Map.Entry<String, Double>> entries1 = carros.entrySet();
        String carMenosEconomico = "";
        for (Map.Entry<String, Double> entry : entries1){
            if (entry.getValue().equals(menosEconomico)){
                carMenosEconomico = entry.getKey();
            }
        }

        System.out.println(carMenosEconomico + " " + menosEconomico);

        //Soma dos consumos
        double soma = 0;
        for (Double v : carros.values()){
            soma += v;
        }
        System.out.println(soma);

        //Média do consumo
        System.out.println(soma/carros.size());

        //remova os consumos menos que 15
        Iterator<Double> iterator = carros.values().iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(15.4)) iterator.remove();
        }
        System.out.println(carros);

        //Exiba na ordem de inserção
        Map<String, Double> carroLinked = new LinkedHashMap<>(carros);
        System.out.println(carroLinked);

        //Ordene o dicionario por key
        Map<String, Double> carroTree = new TreeMap<>(carros);
        System.out.println(carroTree);

        //Apague
        carros.clear();

        //Ver se ta vazio
        carros.isEmpty();

    }
}
