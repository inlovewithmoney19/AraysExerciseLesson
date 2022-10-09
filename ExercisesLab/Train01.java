package LabArraysExercises;
import java.util.Scanner;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numWagons = Integer.parseInt(scanner.nextLine());

        int[] peoplesInWagon = new int[numWagons];
        for (int i = 0; i < numWagons ; i++) {
            int currentNumbers = Integer.parseInt(scanner.nextLine());
            peoplesInWagon[i] = currentNumbers;
        }

        int sumPeoples = 0;
        for (int numbers: peoplesInWagon) {
            System.out.print(numbers + " ");
            sumPeoples += numbers;

        }

        System.out.println();
        System.out.println(sumPeoples);
    }
}
