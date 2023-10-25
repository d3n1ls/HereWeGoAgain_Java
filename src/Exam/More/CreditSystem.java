package Exam.More;

import java.util.Scanner;

public class CreditSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int ones = 0;
        int tens = 0;
        double credits = 0;
        double sumCredits = 0;
        double sumMarks = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 100 >= 10) {
                ones = (number % 100) % 10;
            } else {
                ones = number % 100;
            }
            tens = number / 10;

            if (ones == 2) {
                credits = 0;
            } else if (ones == 3) {
                credits = (tens * 1.0) - (tens * 0.5);
            } else if (ones == 4) {
                credits = (tens * 1.0) - (tens * 0.3);
            } else if (ones == 5) {
                credits = (tens * 1.0) - (tens * 0.15);
            } else if (ones == 6) {
                credits = tens;
            }
            sumCredits += credits;
            sumMarks += ones;
        }
        System.out.printf("%.2f%n", sumCredits);
        System.out.printf("%.2f", sumMarks / n);
    }
}
