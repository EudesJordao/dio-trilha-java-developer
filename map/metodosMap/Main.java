package map.metodosMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        carros.put("gol", 22d);
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
    }
}
