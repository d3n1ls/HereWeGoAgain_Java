package ConditionalStatements.exercise;

import java.util.Scanner;

public class x05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double movieBudget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceStatistClothing = Double.parseDouble(scanner.nextLine());
        double totalPriceStatistClothing = statists * priceStatistClothing;
        double priceDecor = movieBudget * 0.10;
        if (statists > 150) {
            totalPriceStatistClothing = totalPriceStatistClothing - totalPriceStatistClothing * 0.10;
        }
        double neededBudget = totalPriceStatistClothing + priceDecor;

        if (neededBudget > movieBudget) {
            double neededMoney = neededBudget - movieBudget;
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", neededMoney);
        } else {
            double neededMoney = movieBudget - neededBudget;
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", neededMoney);
        }
    }
}