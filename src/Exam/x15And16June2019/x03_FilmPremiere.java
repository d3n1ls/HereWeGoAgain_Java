package Exam.x15And16June2019;

import java.util.Scanner;

public class x03_FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String packageType = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (movieName) {
            case "John Wick":
                switch (packageType) {
                    case "Drink":
                        price = 12;
                        break;
                    case "Popcorn":
                        price = 15;
                        break;
                    case "Menu":
                        price = 19;
                        break;
                }
                break;

            case "Star Wars":
                switch (packageType) {
                    case "Drink":
                        price = 18;
                        break;
                    case "Popcorn":
                        price = 25;
                        break;
                    case "Menu":
                        price = 30;
                        break;
                }
                break;

            case "Jumanji":
                switch (packageType) {
                    case "Drink":
                        price = 9;
                        break;
                    case "Popcorn":
                        price = 11;
                        break;
                    case "Menu":
                        price = 14;
                        break;
                }
                break;
        }
        price *= ticketsCount;

        if (movieName.equals("Star Wars") && ticketsCount >= 4) {
            price *= 0.7;
        } else if (movieName.equals("Jumanji") && ticketsCount == 2) {
            price *= 0.85;
        }
        System.out.printf("Your bill is %.2f leva.", price);
    }
}
