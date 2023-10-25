package Exam.x17December2017;

import java.util.Scanner;

public class x03_IvanovisHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNights = Integer.parseInt(scanner.nextLine());
        String destination = scanner.nextLine();
        String transport = scanner.nextLine();

        double priceKids = 0;
        double priceAdults = 0;
        if ("Miami".equals(destination)) {
            if (countNights <= 10) {
                priceKids = countNights * 14.99;
                priceAdults = countNights * 24.99;
            } else if (countNights <= 15) {
                priceKids = countNights * 11.99;
                priceAdults = countNights * 22.99;
            } else {
                priceKids = countNights * 10.00;
                priceAdults = countNights * 20.00;
            }
        } else if ("Canary Islands".equals(destination)) {
            if (countNights <= 10) {
                priceKids = countNights * 28.50;
                priceAdults = countNights * 32.50;
            } else if (countNights <= 15) {
                priceKids = countNights * 25.60;
                priceAdults = countNights * 30.50;
            } else {
                priceKids = countNights * 22.00;
                priceAdults = countNights * 28.00;
            }
        } else {
            if (countNights <= 10) {
                priceKids = countNights * 39.99;
                priceAdults = countNights * 42.99;
            } else if (countNights <= 15) {
                priceKids = countNights * 36.00;
                priceAdults = countNights * 41.00;
            } else {
                priceKids = countNights * 32.40;
                priceAdults = countNights * 38.50;
            }
        }
        double allFamilyPrice = priceKids * 3 + priceAdults * 2;
        double plusDog = allFamilyPrice + (allFamilyPrice * 0.25);

        double transportPrice = 0;
        if ("train".equals(transport)) {
            transportPrice = (3 * 12.50) + (2 * 22.30);
        } else if ("bus".equals(transport)) {
            transportPrice = (3 * 37.00) + (2 * 45.00);
        } else {
            transportPrice = (3 * 68.50) + (2 * 90.00);
        }

        double finalPrice = plusDog + transportPrice;

        System.out.printf("%.3f", finalPrice);
    }
}
