package Exam.x19March2017;

import java.util.Scanner;

public class x03_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double allKm = 0.0;

        if ("Spring".equalsIgnoreCase(season) || "Autumn".equalsIgnoreCase(season)) {
            if (kmPerMonth <= 5000) {
                allKm = kmPerMonth * 0.75 * 4;
            } else if (kmPerMonth <= 10000) {
                allKm = kmPerMonth * 0.95 * 4;
            } else if (kmPerMonth <= 20000) {
                allKm = kmPerMonth * 1.45 * 4;
            }
        } else if ("Summer".equalsIgnoreCase(season)) {
            if (kmPerMonth <= 5000) {
                allKm = kmPerMonth * 0.90 * 4;
            } else if (kmPerMonth <= 10000) {
                allKm = kmPerMonth * 1.10 * 4;
            } else if (kmPerMonth <= 20000) {
                allKm = kmPerMonth * 1.45 * 4;
            }
        } else {
            if (kmPerMonth <= 5000) {
                allKm = kmPerMonth * 1.05 * 4;
            } else if (kmPerMonth <= 10000) {
                allKm = kmPerMonth * 1.25 * 4;
            } else if (kmPerMonth <= 20000) {
                allKm = kmPerMonth * 1.45 * 4;
            }
        }
        System.out.printf("%.2f", allKm - (allKm * 0.10));
    }
}
