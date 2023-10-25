package Exam.x20November2016;

import java.util.Scanner;

public class x04_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLoad = Integer.parseInt(scanner.nextLine());

        double allLoad = 0;
        double bus = 0;
        double truck = 0;
        double train = 0;

        for (int i = 1; i <= countLoad; i++) {
            int weight = Integer.parseInt(scanner.nextLine());

            if (weight <= 3) {
                bus += weight;
            } else if (weight <= 11) {
                truck += weight;
            } else {
                train += weight;
            }
            allLoad += weight;
        }
        System.out.printf("%.2f%n", (bus * 200 + truck * 175 + train * 120) / allLoad);
        System.out.printf("%.2f%%%n", bus / allLoad * 100);
        System.out.printf("%.2f%%%n", truck / allLoad * 100);
        System.out.printf("%.2f%%%n", train / allLoad * 100);
    }
}
