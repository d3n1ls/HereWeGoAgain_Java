package Exam.More;

import java.util.Scanner;

public class PriceCocktail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int cocktails = Integer.parseInt(scanner.nextLine());

        double priceCocktail = 0;

        if (size.equals("small")) {
            if (fruit.equals("Watermelon")) {
                priceCocktail = 2 * 56.00 * cocktails;
            } else if (fruit.equals("Mango")) {
                priceCocktail = 2 * 36.66 * cocktails;
            } else if (fruit.equals("Pineapple")) {
                priceCocktail = 2 * 42.10 * cocktails;
            } else if (fruit.equals("Raspberry")) {
                priceCocktail = 2 * 20.00 * cocktails;
            }
        } else if (size.equals("big")) {
            if (fruit.equals("Watermelon")) {
                priceCocktail = 5 * 28.70 * cocktails;
            } else if (fruit.equals("Mango")) {
                priceCocktail = 5 * 19.60 * cocktails;
            } else if (fruit.equals("Pineapple")) {
                priceCocktail = 5 * 24.80 * cocktails;
            } else if (fruit.equals("Raspberry")) {
                priceCocktail = 5 * 15.20 * cocktails;
            }
        }
        if (priceCocktail > 1000) {
            priceCocktail = priceCocktail - priceCocktail * 0.50;
        } else if (priceCocktail >= 400 && priceCocktail <= 1000) {
            priceCocktail = priceCocktail - priceCocktail * 0.15;
        }
        System.out.printf("%.2f lv.",priceCocktail);
    }
}
