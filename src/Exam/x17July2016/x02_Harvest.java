package Exam.x17July2016;

import java.util.Scanner;

public class x02_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineyardArea = Integer.parseInt(scanner.nextLine());
        double grapeSqM = Double.parseDouble(scanner.nextLine());
        int wineWant = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());

        double allGrape = vineyardArea * grapeSqM;
        double wineHave = (allGrape * 0.4) / 2.5;

        if (wineHave < wineWant) {
            double diff = Math.floor(wineWant - wineHave);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", diff);
        } else if (wineHave >= wineWant) {
            double diff = wineHave - wineWant;
            double perWorker = diff / countWorkers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters. %n", Math.floor(wineHave));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(diff), Math.ceil(perWorker));
        }
    }
}
