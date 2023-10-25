package Exam.e30And31October2021;

import java.util.Scanner;

public class x05_ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int adults = 0;
        int kids = 0;
        int toys = 0;
        int sweaters = 0;

        double sumPriceToys = 0;
        double sumPriceSweaters = 0;

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
        sumPriceToys = toys * 5;
        sumPriceSweaters = sweaters * 15;
        System.out.printf("Number of adults: %d%n", adults);
        System.out.printf("Number of kids: %d%n", kids);
        System.out.printf("Money for toys: %.0f%n", sumPriceToys);
        System.out.printf("Money for sweaters: %.0f%n", sumPriceSweaters);
    }
}
