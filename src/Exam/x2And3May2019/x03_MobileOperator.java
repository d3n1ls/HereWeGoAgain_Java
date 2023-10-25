package Exam.x2And3May2019;

import java.util.Scanner;

public class x03_MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contractDuration = scanner.nextLine();
        String contractType = scanner.nextLine();
        String addedInternet = scanner.nextLine();
        int monthsCount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (contractDuration) {
            case "one":
                switch (contractType) {
                    case "Small":
                        price = 9.98;
                        break;
                    case "Middle":
                        price = 18.99;
                        break;
                    case "Large":
                        price = 25.98;
                        break;
                    case "ExtraLarge":
                        price = 35.99;
                        break;
                }
                break;

            case "two":
                switch (contractType) {
                    case "Small":
                        price = 8.58;
                        break;
                    case "Middle":
                        price = 17.09;
                        break;
                    case "Large":
                        price = 23.59;
                        break;
                    case "ExtraLarge":
                        price = 31.79;
                        break;
                }
                break;
        }
        if (addedInternet.equals("yes")) {
            if (price <= 10) {
                price += 5.5;
            } else if (price <= 30) {
                price += 4.35;
            } else if (price > 30) {
                price += 3.85;
            }
        }
        if (contractDuration.equals("two")) {
            price *= 0.9625;
        }

        price *= monthsCount;

        System.out.printf("%.2f lv.", price);
    }
}
