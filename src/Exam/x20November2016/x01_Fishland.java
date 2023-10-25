package Exam.x20November2016;

import java.util.Scanner;

public class x01_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelLv = Double.parseDouble(scanner.nextLine());
        double spratLv = Double.parseDouble(scanner.nextLine());
        double beltedBonitoKg = Double.parseDouble(scanner.nextLine());
        double horseMackerelKg = Double.parseDouble(scanner.nextLine());
        int musselsKg = Integer.parseInt(scanner.nextLine());

        double beltedBonitoLv = mackerelLv + (mackerelLv * (60 / 100.0));
        double horseMackerelLv = spratLv + (spratLv * (80 / 100.0));
        double musselsLv = 7.5;

        double beltedBonitoKgLv = beltedBonitoLv * beltedBonitoKg;
        double horseMackerelKgLv = horseMackerelLv * horseMackerelKg;
        double musselKgPrice = musselsLv * musselsKg;

        double allPrice = beltedBonitoKgLv + horseMackerelKgLv + musselKgPrice;

        System.out.printf("%.2f", allPrice);
    }
}
