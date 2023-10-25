package Exam.More;

import java.util.Scanner;

public class CatFoodPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cats = Integer.parseInt(scanner.nextLine());
        int smallCat = 0;
        int bigCat = 0;
        int hugeCat = 0;
        double totalGrams = 0;
        double pricePerKg = 12.45;
        for (int i = 0; i < cats; i++) {
            double grams = Double.parseDouble(scanner.nextLine());
            if (grams >= 100 && grams < 200) {
                smallCat++;
                totalGrams += grams;
            }
            if (grams >= 200 && grams < 300) {
                bigCat++;
                totalGrams += grams;
            }
            if (grams >= 300 && grams < 400) {
                hugeCat++;
                totalGrams += grams;
            }
        }
        System.out.printf("Group 1: %d cats.%n", smallCat);
        System.out.printf("Group 2: %d cats.%n", bigCat);
        System.out.printf("Group 3: %d cats.%n", hugeCat);
        double total = totalGrams / 1000;
        double price = total * pricePerKg;
        System.out.printf("Price for food per day: %.2f lv.", price);
    }
}
