package Exam.More;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int numOfBeers = Integer.parseInt(scanner.nextLine());
        int numOfChips = Integer.parseInt(scanner.nextLine());

        double AllBeerS = 1.20 * numOfBeers;
        double priceOfChips = 0.45 * AllBeerS;
        double AllChips = Math.ceil(priceOfChips * numOfChips);
        double sum = AllBeerS + AllChips;

        if (sum <= budget) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, budget - sum);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, sum - budget);
        }
    }
}
