package Exam.e23And24October2021;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nightsCount = Integer.parseInt(scanner.nextLine()) - 1;
        String roomType = scanner.nextLine();
        String opinion = scanner.nextLine();

        double price = 0;

        switch (roomType) {
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;

                if (nightsCount > 15) {
                    price *= 0.5;
                } else if (nightsCount >= 10) {
                    price *= 0.65;
                } else {
                    price *= 0.7;
                }
                break;
            case "president apartment":
                price = 35;

                if (nightsCount > 15) {
                    price *= 0.8;
                } else if (nightsCount >= 10) {
                    price *= 0.85;
                } else {
                    price *= 0.9;
                }
                break;
        }

        if (opinion.equals("positive")) {
            price *= 1.25;
        } else {
            price *= 0.9;
        }

        price *= nightsCount;

        System.out.printf("%.2f", price);
    }
}
