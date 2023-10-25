package Exam.x7May2017;

import java.util.Scanner;

public class x02_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int countPuzzle = Integer.parseInt(scanner.nextLine());
        int countDolls = Integer.parseInt(scanner.nextLine());
        int countBears = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        double sumBgnAll = (countPuzzle * 2.6) +
                (countDolls * 3) +
                (countBears * 4.10) +
                (countMinions * 8.2) +
                (countTrucks * 2);
        double sumToys = countPuzzle + countDolls + countBears + countMinions + countTrucks;

        double discount = 0.0;
        double tax = 0.0;

        if (sumToys >= 50) {
            discount = sumBgnAll * 0.25;
            sumBgnAll = sumBgnAll - discount;
        }

        tax = sumBgnAll * 0.10;
        sumBgnAll = sumBgnAll - tax;

        if (sumBgnAll >= holidayPrice) {
            System.out.printf("Yes! %.2f lv left.", sumBgnAll - holidayPrice);
        } else {
            double sumNeeded = holidayPrice - sumBgnAll;
            System.out.printf("Not enough money! %.2f lv needed.", sumNeeded);
        }
    }
}
