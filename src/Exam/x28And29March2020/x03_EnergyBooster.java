package Exam.x28And29March2020;

import java.util.Scanner;

public class x03_EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (size) {
            case "small":
                switch (fruit) {
                    case "Watermelon":
                        price = 2 * 56;
                        break;
                    case "Mango":
                        price = 2 * 36.66;
                        break;
                    case "Pineapple":
                        price = 2 * 42.10;
                        break;
                    case "Raspberry":
                        price = 2 * 20;
                        break;
                }
                break;
            case "big":
                switch (fruit) {
                    case "Watermelon":
                        price = 5 * 28.70;
                        break;
                    case "Mango":
                        price = 5 * 19.60;
                        break;
                    case "Pineapple":
                        price = 5 * 24.80;
                        break;
                    case "Raspberry":
                        price = 5 * 15.20;
                        break;
                }
                break;
        }
        price *= count;

        if (price > 1000) {
            price *= 0.5;
        } else if (price >= 400) {
            price *= 0.85;
        }
        System.out.printf("%.2f lv.", price);
    }
}
