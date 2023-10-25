package Exam.x6And7April2019;

import java.util.Scanner;

public class x02_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int statistsCount = Integer.parseInt(scanner.nextLine());
        double costumePrice = Double.parseDouble(scanner.nextLine());

        double decorationsPrice = movieBudget * 0.1;

        if (statistsCount > 150) {
            costumePrice *= 0.9;
        }
        double totalPrice = decorationsPrice + (statistsCount * costumePrice);

        if (movieBudget >= totalPrice) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", movieBudget - totalPrice);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalPrice - movieBudget);
        }
    }
}
