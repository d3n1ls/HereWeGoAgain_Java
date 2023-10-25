package NestedLoops.moreExercises;

import java.util.Scanner;

public class x13_PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPairStart = Integer.parseInt(scanner.nextLine());
        int secondPairStart = Integer.parseInt(scanner.nextLine());
        int firstPairDifference = Integer.parseInt(scanner.nextLine());
        int secondPairDifference = Integer.parseInt(scanner.nextLine());

        int firstPairEnd = firstPairStart + firstPairDifference;
        int secondPairEnd = secondPairStart + secondPairDifference;

        for (int i = firstPairStart; i <= firstPairEnd; i++) {
            for (int j = secondPairStart; j <= secondPairEnd; j++) {
                boolean isPrime = true;

                for (int k = 2; k < i; k++) {
                    if (i % k == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    for (int k = 2; k < j; k++) {
                        if (j % k == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime) {
                    System.out.println(String.format("%d%d", i, j));
                }
            }
        }
    }
}
