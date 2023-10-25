package Exam.More;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradesUsingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalStudents = Integer.parseInt(scanner.nextLine());

        int gradesTo299 = 0;
        int gradesTo399 = 0;
        int gradesTo499 = 0;
        int gradesAbove5 = 0;
        double grades = 0;

        for (int i = 0; i < totalStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            grades += grade;

            switch ((int) grade) {
                case 2:
                    gradesTo299++;
                    break;
                case 3:
                    gradesTo399++;
                    break;
                case 4:
                    gradesTo499++;
                    break;
                default:
                    gradesAbove5++;
                    break;
            }
        }

        DecimalFormat df = new DecimalFormat("0.00%");
        System.out.printf("Top students: %s%n", df.format((double) gradesAbove5 / totalStudents));
        System.out.printf("Between 4.00 and 4.99: %s%n", df.format((double) gradesTo499 / totalStudents));
        System.out.printf("Between 3.00 and 3.99: %s%n", df.format((double) gradesTo399 / totalStudents));
        System.out.printf("Fail: %s%n", df.format((double) gradesTo299 / totalStudents));
        System.out.printf("Average: %.2f%n", grades / totalStudents);
    }
}
