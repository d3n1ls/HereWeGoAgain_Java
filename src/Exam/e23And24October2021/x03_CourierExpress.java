package Exam.e23And24October2021;

import java.util.Scanner;

public class x03_CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String typeOfService = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (typeOfService) {
            case "standard":
                if (weight < 1) {
                    price = distance * 0.03;
                } else if (weight < 10) {
                    price = distance * 0.05;
                } else if (weight < 40) {
                    price = distance * 0.10;
                } else if (weight < 90) {
                    price = distance * 0.15;
                } else if (weight < 150) {
                    price = distance * 0.20;
                }
                break;

            case "express":
                if (weight < 1) {
                    price = (distance * 0.03) + (distance * weight * 0.03 * 0.8);
                } else if (weight < 10) {
                    price = (distance * 0.05) + (distance * weight * 0.05 * 0.4);
                } else if (weight < 40) {
                    price = (distance * 0.10) + (distance * weight * 0.10 * 0.05);
                } else if (weight < 90) {
                    price = (distance * 0.15) + (distance * weight * 0.15 * 0.02);
                } else if (weight < 150) {
                    price = (distance * 0.20) + (distance * weight * 0.20 * 0.01);
                }
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, price);
    }
}
