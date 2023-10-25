package Exam.More;

import java.util.Scanner;

public class BeerStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long beersReserved = Integer.parseInt(scanner.nextLine());
        long beersReceived = 0;

        while (true) {
            String[] input = scanner.nextLine().toLowerCase().trim().split("\\s+");

            if ("over".equals(input[1])) {
                break;
            }

            long amount = Long.parseLong(input[0]);
            String type = input[1];

            switch (type) {
                case "beers":
                    beersReceived += amount;
                    break;
                case "sixpacks":
                    beersReceived += amount * 6;
                    break;
                case "cases":
                    beersReceived += amount * 24;
                    break;
                default:
                    break;
            }
        }

        beersReceived -= beersReceived / 100;

        long beersDifference = beersReceived - beersReserved;
        boolean enoughBeers = true;

        if (beersDifference < 0) {
            enoughBeers = false;
            beersDifference = -beersDifference;
        }

        long casesResult = beersDifference / 24;
        long sixpacksResult = (beersDifference % 24) / 6;
        long beersResult = beersDifference % 6;

        if (enoughBeers) {
            System.out.printf("Cheers! Beer left: %d cases, %d sixpacks and %d beers.%n",
                    casesResult, sixpacksResult, beersResult);
        } else {
            System.out.printf("Not enough beer. Beer needed: %d cases, %d sixpacks and %d beers.%n",
                    casesResult, sixpacksResult, beersResult);
        }
    }
}
