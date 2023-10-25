package Exam.x9And10March2019;

import java.util.Scanner;

public class x03_WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stageOfTournament = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());
        char pictureWithTrophy = scanner.nextLine().charAt(0);

        double price = 0;

        switch (stageOfTournament) {
            case "Quarter final":
                switch (ticketType) {
                    case "Standard":
                        price = 55.5;
                        break;
                    case "Premium":
                        price = 105.2;
                        break;
                    case "VIP":
                        price = 118.9;
                        break;
                }
                break;
            case "Semi final":
                switch (ticketType) {
                    case "Standard":
                        price = 75.88;
                        break;
                    case "Premium":
                        price = 125.22;
                        break;
                    case "VIP":
                        price = 300.4;
                        break;
                }
                break;
            case "Final":
                switch (ticketType) {
                    case "Standard":
                        price = 110.1;
                        break;
                    case "Premium":
                        price = 160.66;
                        break;
                    case "VIP":
                        price = 400;
                        break;
                }
                break;
        }

        price *= ticketsCount;

        if (price > 4000) {
            price *= 0.75;

            if (pictureWithTrophy == 'Y') {
                pictureWithTrophy = 'N';
            }
        } else if (price > 2500) {
            price *= 0.9;
        }

        if (pictureWithTrophy == 'Y') {
            price += (ticketsCount * 40);
        }

        System.out.printf("%.2f", price);
    }
}
