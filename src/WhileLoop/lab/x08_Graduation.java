package WhileLoop.lab;

import java.util.Scanner;

public class x08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int countLowEvaluation = 0;
        double sumGrade = 0.0;
        int countGrade = 0;

        while (countGrade != 12) {
            double evaluation = Double.parseDouble(scanner.nextLine());
            if (evaluation < 4) {
                countLowEvaluation++;
            }
            if (countLowEvaluation > 1) {
                System.out.printf("%s has been excluded at %d grade", name, countGrade);
                break;
            } else {
                sumGrade += evaluation;
                countGrade++;
            }
        }
        if (countLowEvaluation < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumGrade / countGrade);
        }
    }
}

