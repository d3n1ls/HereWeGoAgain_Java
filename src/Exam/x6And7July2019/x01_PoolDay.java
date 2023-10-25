package Exam.x6And7July2019;

import java.util.Scanner;

public class x01_PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double sunbedPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double sunbedsCount = Math.ceil(peopleCount * 0.75);
        double umbrellasCount = Math.ceil(peopleCount / 2.0);
        double totalPrice = (peopleCount * tax) + (sunbedPrice * sunbedsCount) + (umbrellasCount * umbrellaPrice);

        System.out.printf("%.2f lv.", totalPrice);
    }
}
