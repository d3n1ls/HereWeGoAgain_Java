package Exam.x28And29July2018;

import java.util.Scanner;

public class StadiumIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sectors = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());
        double ticketPrice = Double.parseDouble(scan.nextLine());

        double sectorIncomes = (capacity * ticketPrice) / sectors;
        double profit = sectorIncomes * sectors;
        double charity = (profit - (sectorIncomes * 0.75)) / 8;

        System.out.printf("Total income - %.2f BGN%n", profit);
        System.out.printf("Money for charity - %.2f BGN", charity);
    }
}
