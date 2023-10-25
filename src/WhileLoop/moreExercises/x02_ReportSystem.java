package WhileLoop.moreExercises;

import java.util.Scanner;

public class x02_ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetProfit = Integer.parseInt(scanner.nextLine());

        int index = 0;
        int moneyInCash = 0;
        int moneyWithCard = 0;
        int totalMoney = 0;
        int paymentsInCash = 0;
        int paymentsWithCard = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                System.out.println("Failed to collect required money for charity.");
                break;
            }
            int price = Integer.parseInt(input);

            if (index % 2 == 0) {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    moneyInCash += price;
                    totalMoney += price;
                    paymentsInCash++;
                }
            } else {
                if (price < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    moneyWithCard += price;
                    totalMoney += price;
                    paymentsWithCard++;
                }
            }
            index++;

            if (totalMoney >= targetProfit) {
                System.out.printf("Average CS: %.2f%n", moneyInCash * 1.0 / paymentsInCash);
                System.out.printf("Average CC: %.2f", moneyWithCard * 1.0 / paymentsWithCard);
                break;
            }
        }
    }
}
