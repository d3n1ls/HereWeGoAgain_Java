package Exam.x11And12August2018;

import java.util.Scanner;

public class x05_ComputerFirm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int computers = Integer.parseInt(scan.nextLine());

        double sales = 0;
        double rate = 0;

        for (int i = 0; i < computers; i++) {
            int number = Integer.parseInt(scan.nextLine());

            int rating = number % 10;
            int possibleSales = number / 10;
            rate += rating;

            switch (rating) {
                case 3: sales += possibleSales * 0.50; break;
                case 4: sales += possibleSales * 0.70; break;
                case 5: sales += possibleSales * 0.85; break;
                case 6: sales += possibleSales; break;
            }
        }

        double averageRating = rate / computers;
        System.out.printf("%.2f%n", sales);
        System.out.printf("%.2f", averageRating);
    }
}
