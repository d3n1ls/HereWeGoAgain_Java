package Exam.x9And10March2019;

import java.util.Scanner;

public class x01_TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racketPrice = Double.parseDouble(scanner.nextLine());
        int racketsCount = Integer.parseInt(scanner.nextLine());
        int sneakersCount = Integer.parseInt(scanner.nextLine());

        double racketsSum = racketsCount * racketPrice;
        double sneakersSum = sneakersCount * (racketPrice * 1 / 6);
        double othersSum = (racketsSum + sneakersSum) * 0.2;
        double totalSum = racketsSum + sneakersSum + othersSum;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(totalSum / 8));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(totalSum * 7 / 8));
    }
}
