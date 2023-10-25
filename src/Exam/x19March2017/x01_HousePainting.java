package Exam.x19March2017;

import java.util.Scanner;

public class x01_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double houseH = Double.parseDouble(scanner.nextLine());
        double sideL = Double.parseDouble(scanner.nextLine());
        double roofH = Double.parseDouble(scanner.nextLine());

        double backSide = houseH * houseH;
        double frontSide = backSide - (1.2 * 2);
        double sides = ((houseH * sideL) - (1.5 * 1.5)) * 2;
        double greenPaint = (backSide + frontSide + sides) / 3.4;

        double roofSides = (houseH * sideL) * 2;
        double roofTriangles = ((houseH * roofH) / 2) * 2;
        double redPaint = (roofSides + roofTriangles) / 4.3;

        System.out.printf("%.2f%n%.2f", greenPaint, redPaint);
    }
}
