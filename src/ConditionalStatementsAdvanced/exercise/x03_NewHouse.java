package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class x03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kindOfFlowers = scanner.nextLine();
        int numbers = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0.0;
        double flowersPrice = 0.0;
        switch (kindOfFlowers) {
            case "Roses":
                if (numbers > 80) {
                    flowersPrice = 5.00 - 5.00 * 0.10;
                } else {
                    flowersPrice = 5.00;
                }
                break;
            case "Dahlias":
                if (numbers > 90) {
                    flowersPrice = 3.80 - 3.80 * 0.15;
                } else {
                    flowersPrice = 3.80;
                }
                break;
            case "Tulips":
                if (numbers > 80) {
                    flowersPrice = 2.80 - 2.80 * 0.15;
                } else {
                    flowersPrice = 2.80;
                }
                break;
            case "Narcissus":
                if (numbers < 120) {
                    flowersPrice = 3.00 + 3.00 * 0.15;
                } else {
                    flowersPrice = 3.00;
                }
                break;
            case "Gladiolus":
                if (numbers < 80) {
                    flowersPrice = 2.50 + 2.50 * 0.20;
                } else {
                    flowersPrice = 2.50;
                }
                break;
        }
        totalPrice = numbers * flowersPrice;
        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numbers, kindOfFlowers, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}


