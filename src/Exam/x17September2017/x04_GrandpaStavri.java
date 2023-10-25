package Exam.x17September2017;

import java.util.Scanner;

public class x04_GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sumCountRakia = 0.0;
        double sumDegreesRakia = 0.0;
        double allDegrees = 0.0;

        for (int i = 1; i <= n; i++) {
            double countRakia = Double.parseDouble(scanner.nextLine());
            double degreesRakia = Double.parseDouble(scanner.nextLine());

            sumCountRakia += countRakia;
            sumDegreesRakia += (countRakia * degreesRakia);
            allDegrees = sumDegreesRakia / sumCountRakia;
        }
        System.out.printf("Liter: %.2f%n", sumCountRakia);
        System.out.printf("Degrees: %.2f%n", allDegrees);
        if (allDegrees < 38) {
            System.out.println("Not good, you should baking!");
        } else if (allDegrees <= 42) {
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
