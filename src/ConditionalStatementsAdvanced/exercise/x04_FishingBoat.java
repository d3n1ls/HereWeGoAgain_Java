package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class x04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double rent = 0.0;
        double discount = 0.0;
        switch (season) {
            case "Spring":
                rent = 3000;
                if (fishers <= 6) {
                    discount = 0.10;
                } else if (fishers <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                if (fishers <= 6) {
                    discount = 0.10;
                } else if (fishers <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                break;
            case "Winter":
                rent = 2600;
                if (fishers <= 6) {
                    discount = 0.10;
                } else if (fishers <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                break;
        }
        double moneyNeeded = rent - rent * discount;
        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            moneyNeeded *= 0.95;
        }
        if (budget >= moneyNeeded) {
            System.out.printf("Yes! You have %.2f leva left.", budget - moneyNeeded);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded - budget);
        }
    }

}
