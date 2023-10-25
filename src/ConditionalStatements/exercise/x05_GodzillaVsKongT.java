package ConditionalStatements.exercise;

import java.util.Scanner;

public class x05_GodzillaVsKongT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetMovie = Double.parseDouble(scanner.nextLine());
        int stats = Integer.parseInt(scanner.nextLine());
        double priceForDressForOneStat = Double.parseDouble(scanner.nextLine());
        double dress = stats * priceForDressForOneStat;
        double decor = budgetMovie * 0.10;
        if (stats > 150) {
            dress = dress - dress * 0.10;
        }
        double totalForMovie = decor + dress;
        double total = Math.abs(budgetMovie - totalForMovie);
        if (totalForMovie <= budgetMovie) {
            System.out.printf("Action!  %n Wingard starts filming with %.2f leva left." , total);
        } else  {
            System.out.printf("Not enough money!  %n Wingard needs %.2f leva more." , total);
        }
    }
}
