package Exam.x2And3May2019;

import java.util.Scanner;

public class x02_Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double litersFuelNeeded = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double price = litersFuelNeeded * 2.10 + 100;

        if (dayOfWeek.equals("Saturday")) {
            price *= 0.9;
        } else if (dayOfWeek.equals("Sunday")) {
            price *= 0.8;
        }
        if (budget >= price) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - price);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", price - budget);
        }
    }
}
