package LabArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("swap")){

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int symbolOne = numbersArr[index1];
                int symbolTwo = numbersArr[index2];

                numbersArr[index1] = symbolTwo;
                numbersArr[index2] = symbolOne;

            }else if (command.contains("multiply")){

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int symbolOne = numbersArr[index1];
                int symbolTwo = numbersArr[index2];

                int product = symbolOne * symbolTwo;
                numbersArr[index1] = product;

            }else if (command.equals("decrease")){

                for (int i = 0; i < numbersArr.length ; i++) {

                    numbersArr[i] = numbersArr[i] - 1;
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < numbersArr.length ; i++) {

            int currentNumber = numbersArr[i];
            if (i != numbersArr.length -1){
                System.out.print(currentNumber + ", ");

            }else {
                System.out.print(currentNumber);
            }
        }
    }
}
