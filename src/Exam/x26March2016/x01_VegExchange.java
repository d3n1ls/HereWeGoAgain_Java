package Exam.x26March2016;

import java.util.Scanner;

public class x01_VegExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceLvN = Double.parseDouble(scanner.nextLine());
        double priceLvM = Double.parseDouble(scanner.nextLine());
        int kiloN = Integer.parseInt(scanner.nextLine());
        int kiloM = Integer.parseInt(scanner.nextLine());

        double allLv = (priceLvN * kiloN) + (priceLvM * kiloM);

        double eur = 1.94;
        double allEur = allLv / eur;

        System.out.printf("%.2f", allEur);
    }
}
