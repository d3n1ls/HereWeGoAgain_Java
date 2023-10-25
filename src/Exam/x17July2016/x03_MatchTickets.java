package Exam.x17July2016;

import java.util.Scanner;

public class x03_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int countPeople = Integer.parseInt(scanner.nextLine());

        double priceOneTicket = 0.0;
        double priceTransport = 0.0;

        switch (category) {
            case "VIP":
                priceOneTicket = 499.99;
                if (countPeople >= 1 && countPeople <= 4) {
                    priceTransport = budget * 0.75;
                } else if (countPeople >= 5 && countPeople <= 9) {
                    priceTransport = budget * 0.60;
                } else if (countPeople >= 10 && countPeople <= 24) {
                    priceTransport = budget * 0.50;
                } else if (countPeople >= 25 && countPeople <= 49) {
                    priceTransport = budget * 0.40;
                } else if (countPeople > 50) {
                    priceTransport = budget * 0.25;
                }
                break;
            case "Normal":
                priceOneTicket = 249.99;
                if (countPeople >= 1 && countPeople <= 4) {
                    priceTransport = budget * 0.75;
                } else if (countPeople >= 5 && countPeople <= 9) {
                    priceTransport = budget * 0.60;
                } else if (countPeople >= 10 && countPeople <= 24) {
                    priceTransport = budget * 0.50;
                } else if (countPeople >= 25 && countPeople <= 49) {
                    priceTransport = budget * 0.40;
                } else if (countPeople > 50) {
                    priceTransport = budget * 0.25;
                }
                break;

        }
        double margin = budget - priceTransport;
        double priceAllTicket = priceOneTicket * countPeople;
        double lvMargin = 0.0;

        if (margin >= priceAllTicket) {
            lvMargin = margin - priceAllTicket;
            System.out.printf("Yes! You have %.2f leva left.", lvMargin);
        } else {
            lvMargin = priceAllTicket - margin;
            System.out.printf("Not enough money! You need %.2f leva.", lvMargin);
        }
    }
}
