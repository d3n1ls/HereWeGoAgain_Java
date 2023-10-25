package Exam.x6And7April2019;

import java.util.Scanner;

public class x03_OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String hallType = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (hallType) {
            case "normal":
                switch (movieName) {
                    case "A Star Is Born":
                        price = 7.5;
                        break;
                    case "Bohemian Rhapsody":
                        price = 7.35;
                        break;
                    case "Green Book":
                        price = 8.15;
                        break;
                    case "The Favourite":
                        price = 8.75;
                        break;
                }
                break;
            case "luxury":
                switch (movieName) {
                    case "A Star Is Born":
                        price = 10.5;
                        break;
                    case "Bohemian Rhapsody":
                        price = 9.45;
                        break;
                    case "Green Book":
                        price = 10.25;
                        break;
                    case "The Favourite":
                        price = 11.55;
                        break;
                }
                break;
            case "ultra luxury":
                switch (movieName) {
                    case "A Star Is Born":
                        price = 13.5;
                        break;
                    case "Bohemian Rhapsody":
                        price = 12.75;
                        break;
                    case "Green Book":
                        price = 13.25;
                        break;
                    case "The Favourite":
                        price = 13.95;
                        break;
                }
                break;
        }
        price *= ticketsCount;

        System.out.printf("%s -> %.2f lv.", movieName, price);
    }
}
