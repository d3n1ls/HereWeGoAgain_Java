package Exam.x19March2017;

import java.util.Scanner;

public class x01_GrapeAndRakia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaVineyard = Double.parseDouble(scanner.nextLine());
        double kgBySquare = Double.parseDouble(scanner.nextLine());
        double loss = Double.parseDouble(scanner.nextLine());

        double allGrapeLoss = areaVineyard * kgBySquare - loss;
        double grapeRakia = allGrapeLoss * 0.45;
        double rakiaLt = grapeRakia / 7.5;
        double rakiaSum = rakiaLt * 9.80;
        double grapeSale = (allGrapeLoss * 0.55) * 1.5;

        System.out.printf("%.2f%n%.2f", rakiaSum, grapeSale);
    }
}
