package Exam.x7May2017;

import java.util.Scanner;

public class x01_AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerLiter = Double.parseDouble(scanner.nextLine());
        double wineLiter = Double.parseDouble(scanner.nextLine());
        double rakiaLiter = Double.parseDouble(scanner.nextLine());
        double whiskeyLiter = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskeyPrice / 2;
        double winePrice = rakiaPrice - (rakiaPrice * (40 / 100.0));
        double beerPrice = rakiaPrice - (rakiaPrice * (80 / 100.0));

        double sumWhiskey = whiskeyPrice * whiskeyLiter;
        double sumBeer = beerPrice * beerLiter;
        double sumWine = winePrice * wineLiter;
        double sumRakia = rakiaPrice * rakiaLiter;

        double allSum = sumWhiskey + sumBeer + sumWine + sumRakia;

        System.out.printf("%.2f", allSum);
    }
}
