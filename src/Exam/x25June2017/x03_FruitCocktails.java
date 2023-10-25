package Exam.x25June2017;

import java.util.Scanner;

public class x03_FruitCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String sizeCocktail = scanner.nextLine();
        int countCocktail = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        if ("Watermelon".equalsIgnoreCase(fruit)) {
            if ("small".equalsIgnoreCase(sizeCocktail)) {
                price = 2 * 56.00 * countCocktail;
            } else {
                price = 5 * 28.70 * countCocktail;
            }
        } else if ("Mango".equalsIgnoreCase(fruit)) {
            if ("small".equalsIgnoreCase(sizeCocktail)) {
                price = 2 * 36.66 * countCocktail;
            } else {
                price = 5 * 19.60 * countCocktail;
            }
        } else if ("Pineapple".equalsIgnoreCase(fruit)) {
            if ("small".equalsIgnoreCase(sizeCocktail)) {
                price = 2 * 42.10 * countCocktail;
            } else {
                price = 5 * 24.80 * countCocktail;
            }
        } else {
            if ("small".equalsIgnoreCase(sizeCocktail)) {
                price = 2 * 20.00 * countCocktail;
            } else {
                price = 5 * 15.20 * countCocktail;
            }
        }

        double discount = 0.0;

        if (price >= 400 && price <= 1000) {
            discount = price - (price * 0.15);
            System.out.printf("%.2f lv.", discount);
        } else if (price > 1000) {
            discount = price - (price * 0.50);
            System.out.printf("%.2f lv.", discount);
        } else {
            System.out.printf("%.2f lv.", price);
        }
    }
}
