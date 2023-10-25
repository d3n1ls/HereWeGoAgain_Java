package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class x05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String place = "";
        double spendMoney = 0.0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                place = "Camp";
                spendMoney = budget * 0.30;
            } else {
                place = "Hotel";
                spendMoney = budget * 0.70;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                place = "Camp";
                spendMoney = budget * 0.40;
            } else {
                place = "Hotel";
                spendMoney = budget * 0.80;
            }
        } else {
            destination = "Europe";
            spendMoney = budget * 0.90;
            place = "Hotel";
            spendMoney = budget * 0.90;
        }
        System.out.printf("Somewhere in %s%n%s - %.2f", destination, place, spendMoney);
    }
}
