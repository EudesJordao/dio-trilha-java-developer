package list.exercicioList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
    private Scanner scanner = new Scanner(System.in);
    private int contTemp = 0;
    private List<Integer> tempList = new ArrayList<>();

    public void collectTemp(){
        while (this.contTemp <= 5){
            System.out.println("Write the temperature of mouth " + nameMoth(this.contTemp) + ": ");
            int response = scanner.nextInt();
            tempList.add(response);
            this.contTemp++;
        }
        int average = calculateAverage();
        System.out.println("Average: " + average);
        List<Integer> tempAbove = tempAboveAverage(average);
    }

    private int calculateAverage(){
        int sum = 0;
        for (int temp : this.tempList){
            sum += temp;
        }
        int average = sum / this.tempList.size();
        return average;
    }

    private List<Integer> tempAboveAverage(int average){
        List<Integer> tempAboveAverage = new ArrayList<>();
        int count = 0;
        for (int temp : this.tempList){
            if (temp > average){
                tempAboveAverage.add(temp);
                System.out.println(nameMoth(count)+ " " + temp);
            }
                count++;
        }
        return tempAboveAverage;
    }

    private String nameMoth(int choice){
        switch (choice){
            case 0:
                return "January";
            case 1:
                return "February";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
        }
        return "Error";
    }

}
