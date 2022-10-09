package LabArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersArr.length ; i++) {
            int currentNum = numbersArr[i];

            for (int index = i + 1; index < numbersArr.length ; index++) {
                int inNumber = numbersArr[index];

                if (currentNum + inNumber == magicNumber){
                    System.out.println( currentNum + " " + inNumber);
                }
            }
        }
    }
}
