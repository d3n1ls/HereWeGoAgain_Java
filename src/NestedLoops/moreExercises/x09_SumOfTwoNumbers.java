package NestedLoops.moreExercises;

import java.util.Scanner;

public class x09_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicalNumber = Integer.parseInt(scanner.nextLine());

        int combinationCounter = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinationCounter++;

                if (i + j == magicalNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationCounter, i, j, magicalNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combinationCounter, magicalNumber);
    }
}
