package Exam.x18March2017;

import java.util.Scanner;

public class x03_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float budget = Float.parseFloat(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carType = "";
        float price = 0f;

        if (budget < 10 || budget > 10000) {
            System.out.println("Invalid number");
        } else if (budget <= 100) {
            carClass = "Economy class";
            if ("Summer".equalsIgnoreCase(season)) {
                carType = "Cabrio";
                price = budget * (35f / 100);
            } else {
                carType = "Jeep";
                price = budget * (65f / 100);
            }
        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            if ("Summer".equalsIgnoreCase(season)) {
                carType = "Cabrio";
                price = budget * (45f / 100);
            } else {
                carType = "Jeep";
                price = budget * (80f / 100);
            }
        } else if (budget > 500) {
            carClass = "Luxury class";
            carType = "Jeep";
            price = budget * (90f / 100);
        }
        System.out.printf("%s%n%s - %.2f", carClass, carType, price);
    }
}
