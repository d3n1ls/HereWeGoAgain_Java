package Exam.x5November2017;

import java.util.Scanner;

public class x04_ExternalEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;
        int counterFive = 0;
        for (int i = 1; i <= n; i++) {
            double points = Double.parseDouble(scanner.nextLine());

            if (points >= 0 && points <= 22.5) {
                counterOne++;
            } else if (points >= 22.5 && points <= 40.5) {
                counterTwo++;
            } else if (points >= 40.5 && points <= 58.5) {
                counterThree++;
            } else if (points >= 58.5 && points <= 76.5) {
                counterFour++;
            } else if (points >= 76.5 && points <= 100) {
                counterFive++;
            }
        }
        System.out.printf("%.2f%% poor marks%n", counterOne * 1.0 / n * 100.0);
        System.out.printf("%.2f%% satisfactory marks%n", counterTwo * 1.0 / n * 100.0);
        System.out.printf("%.2f%% good marks%n", counterThree * 1.0 / n * 100.0);
        System.out.printf("%.2f%% very good marks%n", counterFour * 1.0 / n * 100.0);
        System.out.printf("%.2f%% excellent marks", counterFive * 1.0 / n * 100.0);
    }
}
