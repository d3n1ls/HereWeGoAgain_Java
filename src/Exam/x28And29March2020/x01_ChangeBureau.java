package Exam.x28And29March2020;

import java.util.Scanner;

public class x01_ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoinsCount = Integer.parseInt(scanner.nextLine());
        double chineseUans = Double.parseDouble(scanner.nextLine());
        double percentageCommission = Double.parseDouble(scanner.nextLine()) / 100;

        double euroFromBitcoins = (bitcoinsCount * 1168) / 1.95;
        double euroFromUans = ((chineseUans * 0.15) * 1.76) / 1.95;

        double totalEuro = (euroFromBitcoins + euroFromUans) * (1.0 - percentageCommission);

        System.out.printf("%.2f", totalEuro);
    }
}
