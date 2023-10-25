package Exam.x18December2016;

import java.util.Scanner;

public class x04_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        double fail = 0;
        double between3And3Point99 = 0;
        double between4And4Point99 = 0;
        double top = 0;
        double allGrade = 0;

        for (int i = 1; i <= countStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 2.00 && grade <= 2.99) {
                fail++;
            } else if (grade > 2.99 && grade <= 3.99) {
                between3And3Point99++;
            } else if (grade > 3.99 && grade <= 4.99) {
                between4And4Point99++;
            } else {
                top++;
            }

            allGrade += grade;
        }

        System.out.printf("Top students: %.2f%%%n", top / countStudents * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", between4And4Point99 / countStudents * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", between3And3Point99 / countStudents * 100);
        System.out.printf("Fail: %.2f%%%n", fail / countStudents * 100);
        System.out.printf("Average: %.2f%n", allGrade / countStudents);
    }
}
