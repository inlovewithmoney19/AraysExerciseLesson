
package LabArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations ; i++) {

            int firstElement = numbersArr[0];
            for (int index = 0; index < numbersArr.length - 1 ; index++) {
                numbersArr[index] = numbersArr[index + 1];
            }
            numbersArr[numbersArr.length -1] = firstElement;
        }
        for (int number : numbersArr) {
            System.out.print(number + " ");
        }
    }
}
