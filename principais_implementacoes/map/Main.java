package principais_implementacoes.map;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome:", "João");
        aluno.put("Idade:", "17");
        aluno.put("Média:", "8.5");
        aluno.put("Turma:", "3A");

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome:", "Maria");
        aluno2.put("Idade:", "12");
        aluno2.put("Média:", "6.7");
        aluno2.put("Turma:", "3A");


        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());


        List<Map<String, String>> alunosMap = new ArrayList<>();

        alunosMap.add(aluno);
        alunosMap.add(aluno2);

        System.out.println(alunosMap);
        System.out.println(aluno.containsKey("Aluno:"));
        System.out.println(aluno.containsKey("Nome:"));

    }
}
