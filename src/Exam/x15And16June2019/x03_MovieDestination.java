package Exam.x15And16June2019;

import java.util.Scanner;

public class x03_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int daysCount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (season) {
            case "Winter":
                switch (destination) {
                    case "Dubai":
                        price = 45000;
                        price *= 0.7;
                        break;
                    case "Sofia":
                        price = 17000;
                        price *= 1.25;
                        break;
                    case "London":
                        price = 24000;
                        break;
                }
                break;

            case "Summer":
                switch (destination) {
                    case "Dubai":
                        price = 40000;
                        price *= 0.7;
                        break;
                    case "Sofia":
                        price = 12500;
                        price *= 1.25;
                        break;
                    case "London":
                        price = 20250;
                        break;
                }
                break;
        }
        price *= daysCount;

        if (budget >= price) {
            System.out.printf("The budget for the movie is enough! " + "We have %.2f leva left!", budget - price);
        } else {
            System.out.printf("The director needs %.2f leva more!", price - budget);
        }
    }
}
