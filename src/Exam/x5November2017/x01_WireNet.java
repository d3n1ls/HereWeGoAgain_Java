package Exam.x5November2017;

import java.util.Scanner;

public class x01_WireNet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthYard = Integer.parseInt(scanner.nextLine());
        int wightYard = Integer.parseInt(scanner.nextLine());
        double heightNet = Double.parseDouble(scanner.nextLine());
        double priceLM = Double.parseDouble(scanner.nextLine());
        double kgSqMNet = Double.parseDouble(scanner.nextLine());

        double lengthNet = lengthYard * 2 + wightYard * 2;
        double priceNet = lengthNet * priceLM;
        double areaNet = lengthNet * heightNet;
        double weightNet = areaNet * kgSqMNet;

        System.out.printf("%.0f%n", lengthNet);
        System.out.printf("%.2f%n", priceNet);
        System.out.printf("%.3f%n", weightNet);
    }
}
