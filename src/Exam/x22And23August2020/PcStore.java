package Exam.x22And23August2020;

import java.util.Scanner;

public class PcStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pricePrcesor = Double.parseDouble(scan.nextLine());
        double priceVideo = Double.parseDouble(scan.nextLine());
        double priceRAM = Double.parseDouble(scan.nextLine());
        int numRAM = Integer.parseInt(scan.nextLine());
        double discount = Double.parseDouble(scan.nextLine());
        double priceTotal = 0;
        double dolar = 1.57;

        priceTotal = (((pricePrcesor * dolar) + (priceVideo * dolar)) * (1 - discount)) + ((priceRAM * dolar) * numRAM);

        System.out.printf("Money needed - %.2f leva.", priceTotal);
        scan.close();

    }
}
