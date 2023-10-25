package ConditionalStatementsAdvanced.moreExercise;

import java.util.Scanner;

public class x03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        char holiday = scanner.nextLine().charAt(0);

        double chrysanthemumPrice = 0.0;
        double rosePrice = 0.0;
        double tulipPrice = 0.0;
        int fNumbers = chrysanthemums + roses + tulips;
        double bouquetPrice = 0.0;

        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumPrice = 2.00;
                rosePrice = 4.10;
                tulipPrice = 2.50;
                break;
            case "Autumn":
            case "Winter":
                chrysanthemumPrice = 3.75;
                rosePrice = 4.50;
                tulipPrice = 4.15;
                break;
        }
        bouquetPrice = chrysanthemums * chrysanthemumPrice + roses * rosePrice + tulips * tulipPrice;

        if (holiday == 'Y') {
            bouquetPrice *= 1.15;
        }
        if (tulips > 7 && season.equals("Spring")) {
            bouquetPrice *= 0.95;
        }
        if (roses >= 10 && season.equals("Winter")) {
            bouquetPrice *= 0.90;
        }
        if (fNumbers > 20) {
            bouquetPrice *= 0.80;
        }
        bouquetPrice += 2;
        System.out.printf("%.2f", bouquetPrice);
    }
}
