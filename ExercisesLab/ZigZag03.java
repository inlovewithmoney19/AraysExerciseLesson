package LabArraysExercises;

import java.util.Scanner;

public class ZigZag03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        String[] firstNumbersArr = new String[rows];
        String[] secondNumbersArr = new String[rows];

        for (int i = 0; i < rows ; i++) {
            String[] numbersArr = scanner.nextLine().split(" ");

            String firstNum = numbersArr[0];
            String secondNum = numbersArr[1];

            if (i % 2 == 0){
                secondNumbersArr[i] = firstNum;
                firstNumbersArr[i] = secondNum;
            }else {
                secondNumbersArr[i] = secondNum;
                firstNumbersArr[i] = firstNum ;
            }
        }
        System.out.println(String.join(" ", secondNumbersArr));
        System.out.println(String.join(" ", firstNumbersArr));
    }
}
