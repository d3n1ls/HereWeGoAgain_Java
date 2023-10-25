package Exam.x26March2016;

import java.util.Scanner;

public class x03_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";
        String accommodation = "";
        double cost = 0.0;

        if (budget <= 100) {
            place = "Bulgaria";
            if ("summer".equals(season)) {
                accommodation = "Camp";
                cost = budget * 0.30;
            } else {
                accommodation = "Hotel";
                cost = budget * 0.70;
            }
        } else if (budget <= 1000) {
            place = "Balkans";
            if ("summer".equals(season)) {
                accommodation = "Camp";
                cost = budget * 0.40;
            } else {
                accommodation = "Hotel";
                cost = budget * 0.80;
            }
        } else {
            place = "Europe";
            accommodation = "Hotel";
            cost = budget * 0.90;
        }
        System.out.printf("Somewhere in %s%n%s - %.2f", place, accommodation, cost);
    }
}
