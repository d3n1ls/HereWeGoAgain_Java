package NestedLoops.moreExercises;

import java.util.Scanner;

public class x10_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOf1Lv = Integer.parseInt(scanner.nextLine());
        int countOf2Lv = Integer.parseInt(scanner.nextLine());
        int countOf5Lv = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());
        int currentSum = 0;

        for (int i = 0; i <= countOf1Lv; i++) {
            for (int j = 0; j <= countOf2Lv; j++) {
                for (int k = 0; k <= countOf5Lv; k++) {
                    currentSum = i * 1 + j * 2 + k * 5;

                    if (currentSum == sum) {
                        System.out.printf("%d * %d lv. + %d * %d lv. + %d * %d lv. = %d lv.%n", i, 1, j, 2, k, 5, sum);
                    }
                }
            }
        }
    }
}
