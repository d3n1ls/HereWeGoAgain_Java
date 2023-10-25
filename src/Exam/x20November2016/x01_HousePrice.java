package Exam.x20November2016;

import java.util.Scanner;

public class x01_HousePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double room1 = Double.parseDouble(scanner.nextLine());
        double kitchen = Double.parseDouble(scanner.nextLine());
        double priceSqM = Double.parseDouble(scanner.nextLine());

        double bath = room1 / 2;
        double room2 = room1 + (room1 * (10 / 100.0));
        double room3 = room2 + (room2 * (10 / 100.0));
        double allRoom = kitchen + bath + room1 + room2 + room3;
        double fullHouse = allRoom + (allRoom * 5 / 100.0);

        double fullPrice = fullHouse * priceSqM;

        System.out.printf("%.2f", fullPrice);
    }
}
