package Exam.x22And23August2020;

import java.util.Scanner;

public class Aquapark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int hours = Integer.parseInt(scan.nextLine());
        int num = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();
        double priceHour = 0;
        double price = 0;

        switch (month) {
            case "march":
            case "april":
            case "may":
                if (time.equals("day")) {
                    if (hours >= 5) {
                        price = (hours * 10.5) / 2;
                        priceHour = 10.5 / 2;
                    } else {
                        price = hours * 10.5;
                        priceHour = 10.5;
                    }
                }else if (time.equals("night")) {
                    if (hours >= 5) {
                        price = (hours * 8.4) / 2;
                        priceHour = 8.4 / 2;
                    } else {
                        price = hours * 8.4;
                        priceHour = 8.4;
                    }
                }
                break;

            case "june":
            case "july":
            case "august":
                if (time.equals("day")) {
                    if (hours >= 5) {
                        price = (hours * 12.6) / 2;
                        priceHour = 12.6 / 2;
                    } else {
                        price = hours * 12.6;
                        priceHour = 12.6;
                    }
                }else if (time.equals("night")) {
                    if (hours >= 5) {
                        price = (hours * 10.2) / 2;
                        priceHour = 10.2 / 2;
                    } else {
                        price = hours * 10.2;
                        priceHour = 10.2;
                    }
                }
                break;
        }

        if (num >= 4) {
            price *= (1 - 0.1);
            priceHour *= (1 - 0.1);
        }
        price *= num;

        System.out.printf("Price per person for one hour: %.2f\n", priceHour);
        System.out.printf("Total cost of the visit: %.2f", price);
        scan.close();
    }
}
