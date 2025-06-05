package list.exercicioList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
    private Scanner scanner = new Scanner(System.in);
    private List<Integer> responseList = new ArrayList<>();

    public void questionSuspect(){
        System.out.println("Answer with 1 for yes or 2 for no");
        System.out.println("Called to victim?");
        this.responseList.add(scanner.nextInt());
        System.out.println("Been in locale?");
        this.responseList.add(scanner.nextInt());
        System.out.println("Lives close the victim?");
        this.responseList.add(scanner.nextInt());
        System.out.println("owed to the victim?");
        this.responseList.add(scanner.nextInt());
        System.out.println("Worked with victim?");
        this.responseList.add(scanner.nextInt());

        String evaluate = evaluateSuspect();
        System.out.println("The interviewed is " + evaluate);
    }

    private String evaluateSuspect(){
        int contNumberOne = 0;

        for (int answer : this.responseList){
            if (answer == 1){
                contNumberOne++;
            }
        }
        if (contNumberOne == 2){
            return "Suspect";
        } else if (contNumberOne == 3 || contNumberOne == 4) {
            return "Accomplice";
        } else if (contNumberOne == 5){
            return "Assassin";
        }
        return "innocent";
    }
}
