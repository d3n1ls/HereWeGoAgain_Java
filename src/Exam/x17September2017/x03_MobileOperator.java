package Exam.x17September2017;

import java.util.Scanner;

public class x03_MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        String tariffType = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double value = 0.0;
        double sum = 0.0;
        double allSum = 0.0;
        double allSumDisc = 0.0;

        if (tariffType.equals("Small")) {
            if ("one".equalsIgnoreCase(year)) {
                value = 9.98;
                sum = value * months;
            } else {
                value = 8.58;
                sum = value * months;
            }
        } else if (tariffType.equals("Middle")) {
            if ("one".equalsIgnoreCase(year)) {
                value = 18.99;
                sum = value * months;
            } else {
                value = 17.09;
                sum = value * months;
            }
        } else if (tariffType.equals("Large")) {
            if ("one".equalsIgnoreCase(year)) {
                value = 25.98;
                sum = value * months;
            } else {
                value = 23.59;
                sum = value * months;
            }
        } else if (tariffType.equals("ExtraLarge")) {
            if ("one".equalsIgnoreCase(year)) {
                value = 35.99;
                sum = value * months;
            } else {
                value = 31.79;
                sum = value * months;
            }
        } else {
            System.out.println();
        }

        if (internet.equals("yes")) {
            if (value <= 10) {
                allSum = (value + 5.50) * months;
            } else if (value <= 30) {
                allSum = (value + 4.35) * months;
            } else {
                allSum = (value + 3.85) * months;
            }
        } else {
            allSum = sum;
        }

        if ("two".equalsIgnoreCase(year)) {
            allSumDisc = allSum - (allSum * 0.0375);
            System.out.printf("%.2f lv.", allSumDisc);
        } else {
            System.out.printf("%.2f lv.", allSum);
        }
    }
}
