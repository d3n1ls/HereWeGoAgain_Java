package Exam.x6And7July2019;

import java.util.Scanner;

public class x03_TravelAgency01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String type = scanner.nextLine();
        String discount = scanner.nextLine();

        int days = Integer.parseInt(scanner.nextLine());
        boolean isInvalid = false;
        double price = 0;
        double discountPercent = 0;
        int countDays = 0;

        if ("Bansko".equals(city) || "Borovets".equals(city)) {
            if (type.equals("withEquipment")) {
                price = 100;
                if (discount.equals("yes")) {
                    price = price - (price * 0.1);
                }
            } else if (type.equals("noEquipment")) {
                price = 80;
                if (discount.equals("yes")) {
                    price = price - (price * 0.05);
                }
            } else {
                isInvalid = true;
            }
        } else if ("Varna".equals(city) || "Burgas".equals(city)) {
            if (type.equals("withBreakfast")) {
                price = 130;
                if (discount.equals("yes")) {
                    price = price - (price * 0.12);
                }
            } else if (type.equals("noBreakfast")) {
                price = 100;
                if (discount.equals("yes")) {
                    price = price - (price * 0.07);
                }
            } else {
                isInvalid = true;
            }
        } else {
            isInvalid = true;
        }
        if (days > 7) {
            days = days - 1;
        }
        if (days <= 0) {
            System.out.println("Days must be positive number!");
        } else if (isInvalid) {
            System.out.println("Invalid input!");
        } else {
            double sum = price * days;
            System.out.printf("The price is %.2flv! Have a nice time!", sum);
        }
    }
}
