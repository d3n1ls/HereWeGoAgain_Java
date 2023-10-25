package Exam.x15And16June2019;

import java.util.Scanner;

public class x05_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int seriesCount = Integer.parseInt(scanner.nextLine());

        double moneyNeeded = 0;

        for (int i = 0; i < seriesCount; i++) {
            String seriesName = scanner.nextLine();
            double seriesPrice = Double.parseDouble(scanner.nextLine());

            switch (seriesName) {
                case "Thrones":
                    seriesPrice *= 0.5;
                    break;
                case "Lucifer":
                    seriesPrice *= 0.6;
                    break;
                case "Protector":
                    seriesPrice *= 0.7;
                    break;
                case "TotalDrama":
                    seriesPrice *= 0.8;
                    break;
                case "Area":
                    seriesPrice *= 0.9;
                    break;
            }
            moneyNeeded += seriesPrice;
        }
        if (budget >= moneyNeeded) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - moneyNeeded);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", moneyNeeded - budget);
        }
    }
}
