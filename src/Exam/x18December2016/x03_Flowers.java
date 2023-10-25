package Exam.x18December2016;

import java.util.Scanner;

public class x03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChrys = Integer.parseInt(scanner.nextLine());
        int countRose = Integer.parseInt(scanner.nextLine());
        int countTulip = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double priceChrys = 0.0;
        double priceRose = 0.0;
        double priceTulip = 0.0;

        double allPriceFlower = 0.0;

        if ("Spring".equalsIgnoreCase(season) || "Summer".equalsIgnoreCase(season)) {
            priceChrys = 2.0;
            priceRose = 4.10;
            priceTulip = 2.50;
        } else {
            priceChrys = 3.75;
            priceRose = 4.50;
            priceTulip = 4.15;
        }

        if ("Y".equalsIgnoreCase(holiday)) {
            priceChrys = (priceChrys + (priceChrys * 0.15)) * countChrys;
            priceRose = (priceRose + (priceRose * 0.15)) * countRose;
            priceTulip = (priceTulip + (priceTulip * 0.15)) * countTulip;
        } else {
            priceChrys = priceChrys * countChrys;
            priceRose = priceRose * countRose;
            priceTulip = priceTulip * countTulip;
        }

        allPriceFlower = priceChrys + priceRose + priceTulip;

        if ("Spring".equalsIgnoreCase(season) && countTulip > 7) {
            allPriceFlower = allPriceFlower - (allPriceFlower * 0.05);
        }

        if ("Winter".equalsIgnoreCase(season) && countRose >= 10) {
            allPriceFlower = allPriceFlower - (allPriceFlower * 0.10);
        }

        if (countChrys + countRose + countTulip > 20) {
            allPriceFlower = allPriceFlower - (allPriceFlower * 0.20);
        }
        System.out.printf("%.2f", allPriceFlower + 2);
    }
}
