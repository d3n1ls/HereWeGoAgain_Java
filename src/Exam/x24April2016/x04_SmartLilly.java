package Exam.x24April2016;

import java.util.Scanner;

public class x04_SmartLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        double allMoneyEvenYear = 0;
        double allMoneyOddYear = 0;
        double moneyEvenYear = 0;
        double brotherTook = 0;
        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                moneyEvenYear += 10;
                allMoneyEvenYear += moneyEvenYear;
                brotherTook += 1;
            } else {
                allMoneyOddYear += priceToy;
            }
        }
        double leftMoney = (allMoneyEvenYear - brotherTook) + allMoneyOddYear;
        double diff = Math.abs(priceMachine - leftMoney);

        if (leftMoney >= priceMachine) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
