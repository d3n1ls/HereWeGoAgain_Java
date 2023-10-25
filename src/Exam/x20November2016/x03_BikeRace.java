package Exam.x20November2016;

import java.util.Scanner;

public class x03_BikeRace   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJuniors = Integer.parseInt(scanner.nextLine());
        int countSeniors = Integer.parseInt(scanner.nextLine());
        String typeRout = scanner.nextLine();

        double sumAllRacers = countJuniors + countSeniors;
        double sumTax = 0.0;

        if ("trail".equals(typeRout)) {
            sumTax = (countJuniors * 5.50) + (countSeniors * 7.00);
        } else if ("cross-country".equals(typeRout)) {
            sumTax = (countJuniors * 8.00) + (countSeniors * 9.50);
            if (sumAllRacers >= 50) {
                sumTax = sumTax - (sumTax * 0.25);
            }
        } else if ("downhill".equals(typeRout)) {
            sumTax = (countJuniors * 12.25) + (countSeniors * 13.75);
        } else {
            sumTax = (countJuniors * 20.00) + (countSeniors * 21.50);
        }

        double sumTaxMinusExp = sumTax - (sumTax * 0.05);
        System.out.printf("%.2f", sumTaxMinusExp);
    }
}
