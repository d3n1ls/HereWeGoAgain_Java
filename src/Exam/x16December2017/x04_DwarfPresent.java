package Exam.x16December2017;

import java.util.Scanner;

public class x04_DwarfPresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int moneySanta = Integer.parseInt(scanner.nextLine());

        double allPresentMoney = 0;
        for (int i = 0; i < n; i++) {
            String present = scanner.nextLine();

            if ("sand clock".equals(present)) {
                allPresentMoney += 2.20;
            }
            if ("magnet".equals(present)) {
                allPresentMoney += 1.50;
            }
            if ("cup".equals(present)) {
                allPresentMoney += 5.00;
            }
            if ("t-shirt".equals(present)) {
                allPresentMoney += 10.00;
            }
        }
        double diff = Math.abs(moneySanta - allPresentMoney);
        if (moneySanta >= allPresentMoney) {
            System.out.printf("Santa Claus has %.2f more leva left!", diff);
        } else {
            System.out.printf("Santa Claus will need %.2f more leva.", diff);
        }
    }
}
