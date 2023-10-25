package Exam.e23And24October2021;

import java.util.Scanner;

public class x01_Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleInTheGroup = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        int cardsCount = Integer.parseInt(scanner.nextLine());
        int ticketsCount = Integer.parseInt(scanner.nextLine());

        double price = (nightsCount * 20 + cardsCount * 1.60 + ticketsCount * 6) * peopleInTheGroup;
        double totalPrice = price * 1.25;

        System.out.printf("%.2f", totalPrice);
    }
}
