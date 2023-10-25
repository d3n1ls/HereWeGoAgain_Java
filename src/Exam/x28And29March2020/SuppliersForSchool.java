package Exam.x28And29March2020;

import java.util.Scanner;

public class SuppliersForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pen = Integer.parseInt(scan.nextLine());
        int marker = Integer.parseInt(scan.nextLine());
        double clean = Double.parseDouble(scan.nextLine());
        double discount = Double.parseDouble(scan.nextLine());
        double price = 0;

        price = (pen * 5.8) + (marker * 7.2) + (clean * 1.2);
        discount /= 100;
        price *= (1 - discount);

        System.out.printf("%.3f", price);
        scan.close();
    }
}
