package Exam.More;

import java.util.Scanner;

public class GoodJobAverageDoldPerDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < locations; i++) {
            double expectedProduce = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double producePerDay = 0;
            for (int j = 1; j <= days; j++) {
                double produce = Double.parseDouble(scanner.nextLine());
                producePerDay += produce;
            }
            double avgProduce = producePerDay / days;
            if (avgProduce >= expectedProduce) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", avgProduce);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedProduce - avgProduce);
            }
        }
    }
}
