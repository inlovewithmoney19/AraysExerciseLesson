package LabArraysExercises;

import java.util.Scanner;

public class CommonElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String secondArrElement : secondArr ) {
            for (String firstArrElement : firstArr){
                if (secondArrElement.equals(firstArrElement)){
                    System.out.print(firstArrElement + " ");
                    break;
                }
            }
        }
    }
}
