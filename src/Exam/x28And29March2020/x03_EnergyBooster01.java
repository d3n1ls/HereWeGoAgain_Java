package Exam.x28And29March2020;

import java.util.Scanner;

public class x03_EnergyBooster01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String size = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());
        double price = 0;

        if (size.equals("small")) {
            switch (fruit) {
                case "Watermelon":
                    price = num * 2 * 56;
                    break;
                case "Mango":
                    price = num * 2 * 36.66;
                    break;
                case "Pineapple":
                    price = num * 2 * 42.1;
                    break;
                case "Raspberry":
                    price = num * 2 * 20;
                    break;
            }
        } else if (size.equals("big")) {
            switch (fruit) {
                case "Watermelon":
                    price = num * 5 * 28.7;
                    break;
                case "Mango":
                    price = num * 5 * 19.6;
                    break;
                case "Pineapple":
                    price = num * 5 * 24.8;
                    break;
                case "Raspberry":
                    price = num * 5 * 15.2;
                    break;
            }
        }
        if ((400 <= price) && (price <= 1000)) {
            price *= (1 - 0.15);
        }else if (price > 1000) {
            price *= (1 - 0.5);
        }
        System.out.printf("%.2f lv.", price);
        scan.close();
    }
}
