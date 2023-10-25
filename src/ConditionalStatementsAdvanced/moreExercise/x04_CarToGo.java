package ConditionalStatementsAdvanced.moreExercise;

import java.util.Scanner;

public class x04_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String cl = "";
        String type = "";
        double carPrice = 0.0;

        if (budget > 500) {
            cl = "Luxury class";
            carPrice = budget * 0.90;
        } else if (budget > 100) {
            cl = "Compact class";
            if (season.equals("Summer")) {
                carPrice = budget * 0.45;
            } else {
                carPrice = budget * 0.80;
            }
        } else {
            cl = "Economy class";
            if (season.equals("Summer")) {
                carPrice = budget * 0.35;
            } else {
                carPrice = budget * 0.65;
            }
        }
        if (season.equals("Summer")) {
            type = "Cabrio";
        } else {
            type = "Jeep";
        }
        if (budget > 500) {
            type = "Jeep";
        }
        System.out.printf("%s%n", cl);
        System.out.printf("%s - %.2f", type, carPrice);
    }
}
