package Exam.x10And11March2018;

import java.util.Scanner;

public class HearthStone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int breakTime = Integer.parseInt(scanner.nextLine());
        double priceOneCardPack = Double.parseDouble(scanner.nextLine());
        double priceOneAdventure = Double.parseDouble(scanner.nextLine());
        double coffeePrice = Double.parseDouble(scanner.nextLine());

        double allSpentMoney = 0;
        double timeForChill = breakTime - 5;
        double timeForBuyingCardPacks = 3 * 2;
        double timeForBuyingAdventures = 2 * 2;
        double spentMoneyForCardPacks = 3 * priceOneCardPack;
        double spentMoneyForAdventures = 2 * priceOneAdventure;

        allSpentMoney = spentMoneyForAdventures + coffeePrice + spentMoneyForCardPacks;
        timeForChill -= timeForBuyingCardPacks + timeForBuyingAdventures;

        System.out.printf("%.2f%n", allSpentMoney);
        System.out.printf("%.0f%n", timeForChill);
    }
}
