package LabArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsSum06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;

        for (int i = 0; i < numberArr.length; i++) {
            int currentNumber = numberArr[i];

            int leftSum = 0 ;
            int rightSum = 0 ;

            for (int leftIndex = 0; leftIndex < i  ; leftIndex++) {
                leftSum +=numberArr[leftIndex];
            }

            for (int rightIndex =  i + 1 ; rightIndex < numberArr.length   ; rightIndex++) {
                rightSum += numberArr[rightIndex];
            }
            if (leftSum == rightSum){
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("no");
        }
    }
}
