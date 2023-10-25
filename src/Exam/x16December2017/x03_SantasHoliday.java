package Exam.x16December2017;

import java.util.Scanner;

public class x03_SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNights = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String rating = scanner.nextLine();

        double priceNights = 0;
        if ("room for one person".equals(type)) {
            priceNights = (countNights - 1) * 18.0;
        } else if ("apartment".equals(type)) {
            priceNights = (countNights - 1) * 25.00;
            if (countNights < 10) {
                priceNights = priceNights - (priceNights * 0.3);
            } else if (countNights < 16) {
                priceNights = priceNights - (priceNights * 0.35);
            } else {
                priceNights = priceNights - (priceNights * 0.5);
            }
        } else {
            priceNights = (countNights - 1) * 35.00;
            if (countNights < 10) {
                priceNights = priceNights - (priceNights * 0.1);
            } else if (countNights < 16) {
                priceNights = priceNights - (priceNights * 0.15);
            } else {
                priceNights = priceNights - (priceNights * 0.2);
            }
        }
        if ("positive".equals(rating)) {
            priceNights = priceNights + (priceNights * 0.25);
        } else {
            priceNights = priceNights - (priceNights * 0.1);
        }
        System.out.printf("%.2f", priceNights);
    }
}
