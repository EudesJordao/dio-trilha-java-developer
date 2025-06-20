package map.execiciosMap;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Map<String, String> populacao = new HashMap<>(){{
            put("PE", "9.616.621");
            put("AL", "3.351.543");
            put("CE", "9.187.103");
            put("RN", "3.534.265");
        }};

        populacao.put("RN", "3.534.165");

        if (!populacao.containsKey("PB")){
            populacao.put("PB", "4.039.277");
        }

        System.out.println(populacao);
        System.out.println(populacao.get("PE"));

        Map<String, String> populacaoLinked = new LinkedHashMap<>(){{
            put("PE", "9.616.621");
            put("AL", "3.351.543");
            put("CE", "9.187.103");
            put("RN", "3.534.265");
        }};

        System.out.println(populacaoLinked);

        Map<String, String> populacaoTree = new TreeMap<>(populacao);
        System.out.println(populacaoTree);

        System.out.println(Collections.min(populacao.values()));

        System.out.println(Collections.max(populacao.values()));

        

    }

}
