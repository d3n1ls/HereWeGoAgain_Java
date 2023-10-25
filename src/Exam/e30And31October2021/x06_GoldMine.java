package Exam.e30And31October2021;

import java.util.Scanner;

public class x06_GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locationCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < locationCount; i++) {
            double goldFromCurrentLocation = 0;

            double expectedAverGoldPerDay = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < days; j++) {
                goldFromCurrentLocation += Integer.parseInt(scanner.nextLine());
            }
            if (!((goldFromCurrentLocation / days) < expectedAverGoldPerDay)) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", goldFromCurrentLocation / days);
            } else {
                System.out.printf("You need %.2f gold.%n", (Math.abs(expectedAverGoldPerDay - goldFromCurrentLocation / days)));
            }
        }
    }
}
