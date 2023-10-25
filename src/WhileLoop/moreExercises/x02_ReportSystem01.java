package WhileLoop.moreExercises;

import java.util.Scanner;

public class x02_ReportSystem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetProfit = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int moneyCash = 0;
        int moneyCard = 0;
        int moneySum = 0;
        int countPayment = 0;
        int countCash = 0;
        int countCard = 0;

        while (!input.equals("End")) {
            int productPrice = Integer.parseInt(input);

            if (countPayment % 2 == 0) {
                if (productPrice > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    moneyCash += productPrice;
                    moneySum += productPrice;
                    countCash++;
                }
            } else {
                if (productPrice < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    moneyCard += productPrice;
                    moneySum += productPrice;
                    countCard++;
                }
            }
            countPayment++;

            if (targetProfit <= moneySum) {
                System.out.printf("Average CS: %.2f%n", moneyCash * 1.0 / countCash);
                System.out.printf("Average CC: %.2f", moneyCard * 1.0 / countCard);
            }
            input = scanner.nextLine();
        }
        System.out.println("Failed to collect required money for charity.");
    }
}

