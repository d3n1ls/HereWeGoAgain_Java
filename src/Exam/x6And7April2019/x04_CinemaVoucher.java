package Exam.x6And7April2019;

import java.util.Scanner;

public class x04_CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moneyInVoucher = Integer.parseInt(scanner.nextLine());

        int ticketsCount = 0;
        int otherPurchasesCount = 0;

        while (true) {
            String purchase = scanner.nextLine();

            if (purchase.equals("End")) {
                break;
            }
            double purchasePrice = 0;

            if (purchase.length() > 8) {
                for (int i = 0; i < 2; i++) {
                    purchasePrice += purchase.charAt(i);
                }
            } else {
                purchasePrice = purchase.charAt(0);
            }
            if (moneyInVoucher >= purchasePrice) {
                moneyInVoucher -= purchasePrice;

                if (purchase.length() > 8) {
                    ticketsCount++;
                } else {
                    otherPurchasesCount++;
                }
            } else {
                break;
            }
        }
        System.out.println(ticketsCount);
        System.out.println(otherPurchasesCount);
    }
}
