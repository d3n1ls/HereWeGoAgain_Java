package Exam.x17July2016;

import java.util.Scanner;

public class x01_Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double cny = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double bitcoinLv = bitcoin * 1168;
        double cnyUSD = cny * 0.15;
        double usdToLv = 1.76;
        double eurToLv = 1.95;
        double cnyToLv = cnyUSD * usdToLv;

        double allLv = bitcoinLv + cnyToLv;
        double taxPercent = (tax / 100) * allLv;
        double LvMinusTax = allLv - taxPercent;

        double allEur = LvMinusTax / eurToLv;

        System.out.printf("%.2f", allEur);
    }
}
