package Exam.x6And7July2019;

import java.util.Scanner;

public class x03_TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String packageType = scanner.nextLine();
        String VIPDiscount = scanner.nextLine();
        int daysCount = Integer.parseInt(scanner.nextLine());

        if (daysCount < 1) {
            System.out.println("Days must be positive number!");
            return;
        } else if (daysCount > 7) {
            daysCount--;
        }
        double price = 0;

        switch (city) {
            case "Bansko":
            case "Borovets":
                switch (packageType) {
                    case "withEquipment":
                        price = 100;

                        if (VIPDiscount.equals("yes")) {
                            price *= 0.9;
                        }
                        break;
                    case "noEquipment":
                        price = 80;

                        if (VIPDiscount.equals("yes")) {
                            price *= 0.95;
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                        return;
                }
                break;
            case "Varna":
            case "Burgas":
                switch (packageType) {
                    case "withBreakfast":
                        price = 130;

                        if (VIPDiscount.equals("yes")) {
                            price *= 0.88;
                        }
                        break;
                    case "noBreakfast":
                        price = 100;

                        if (VIPDiscount.equals("yes")) {
                            price *= 0.93;
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                        return;
                }
                break;
            default:
                System.out.println("Invalid input!");
                return;
        }
        price *= daysCount;

        System.out.printf("The price is %.2flv! Have a nice time!", price);
    }
}
