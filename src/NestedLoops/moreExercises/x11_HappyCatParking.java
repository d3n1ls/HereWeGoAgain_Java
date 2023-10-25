package NestedLoops.moreExercises;

import java.util.Scanner;

public class x11_HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int d = 1; d <= daysCount; d++) {
            double currentSum = 0;

            for (int h = 1; h <= hoursPerDay; h++) {
                if ((d % 2 != 0) && (h % 2 == 0)) {
                    currentSum += 1.25;
                } else if ((d % 2 == 0) && (h % 2 != 0)) {
                    currentSum += 2.50;
                } else {
                    currentSum += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", d, currentSum);
            sum += currentSum;
        }
        System.out.printf("Total: %.2f leva", sum);
    }
}
