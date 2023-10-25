package Exam.x18March2017;

import java.util.Scanner;

public class x01_DogHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA = Double.parseDouble(scanner.nextLine());
        double heightHouse = Double.parseDouble(scanner.nextLine());

        double halfA = sideA / 2;
        double sides = (sideA * halfA) * 2;
        double backSide = (halfA * halfA) + (halfA * (heightHouse - halfA) / 2);
        double entry = (sideA / 5) * (sideA / 5);
        double frontSide = backSide - entry;
        double roof = (sideA * halfA) * 2;

        double areaSides = sides + backSide + frontSide;
        double greenPaint = areaSides / 3;

        double redPaint = roof / 5;

        System.out.printf("%.2f%n%.2f", greenPaint, redPaint);
    }
}
