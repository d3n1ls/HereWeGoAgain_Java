package Exam.x28And29March2020;

import java.util.Scanner;

public class x01_BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hallRent = Double.parseDouble(scanner.nextLine());

        double cakePrice = hallRent * 0.2;
        double drinksPrice = cakePrice * 0.55;
        double animatorPrice = hallRent / 3;

        double totalPrice = hallRent + cakePrice + drinksPrice + animatorPrice;

        System.out.printf("%.2f", totalPrice);
    }
}
