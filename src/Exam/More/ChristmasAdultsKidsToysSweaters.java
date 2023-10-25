package Exam.More;

import java.util.Scanner;

public class ChristmasAdultsKidsToysSweaters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int adults = 0;
        int kids = 0;
        int toys = 0;
        int sweaters = 0;
        double priceToys = 0;
        double priceSweaters = 0;
        double totalPriceToys = 0;
        double totalPriceSweaters = 0;

        String command = scanner.nextLine();

        while (!command.equals("Christmas")) {
            int age = Integer.parseInt(command);
            if (age <= 16) {
                kids++;
                toys++;
            } else {
                adults++;
                sweaters++;
            }
            command = scanner.nextLine();
        }
        totalPriceToys = toys * 5;
        totalPriceSweaters = sweaters * 15;
        System.out.printf("Number of adults: %d%n", adults);
        System.out.printf("Number of kids: %d%n", kids);
        System.out.printf("Money for toys: %.0f%n", totalPriceToys);
        System.out.printf("Money for sweaters: %.0f%n", totalPriceSweaters);
    }
}
