package Exam.More;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sushiType = scan.nextLine();
        String restaurantName = scan.nextLine();
        int portions = Integer.parseInt(scan.nextLine());
        String order = scan.nextLine();

        double price = 0.0;

        switch (restaurantName) {
            case "Sushi Zone":
                if (sushiType.equals("sashimi")) {
                    price = 4.99;
                } else if (sushiType.equals("maki")) {
                    price = 5.29;
                } else if (sushiType.equals("uramaki")) {
                    price = 5.99;
                } else {
                    price = 4.29;
                }
                break;
            case "Sushi Time":
                if (sushiType.equals("sashimi")) {
                    price = 5.49;
                } else if (sushiType.equals("maki")) {
                    price = 4.69;
                } else if (sushiType.equals("uramaki")) {
                    price = 4.49;
                } else {
                    price = 5.19;
                }
                break;
            case "Sushi Bar":
                if (sushiType.equals("sashimi")) {
                    price = 5.25;
                } else if (sushiType.equals("maki")) {
                    price = 5.55;
                } else if (sushiType.equals("uramaki")) {
                    price = 6.25;
                } else {
                    price = 4.75;
                }
                break;
            case "Asian Pub":
                if (sushiType.equals("sashimi")) {
                    price = 4.50;
                } else if (sushiType.equals("maki")) {
                    price = 4.80;
                } else if (sushiType.equals("uramaki")) {
                    price = 5.50;
                } else {
                    price = 5.50;
                }
                break;
            default:
                System.out.printf("%s is invalid restaurant!", restaurantName);
                break;
        }

        double priceOrder = portions * price;
        if (order.equals("Y")) {
            priceOrder += (priceOrder * 0.2);
        }

        if (price > 0) {
            System.out.printf("Total price: %.0f lv.", Math.ceil(priceOrder));
        }
    }
}
