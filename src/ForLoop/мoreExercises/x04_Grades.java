package ForLoop.мoreExercises;

import java.util.Scanner;

public class x04_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNumbers = Integer.parseInt(scanner.nextLine());

        int failNum = 0;
        int between34Num = 0;
        int between45Num = 0;
        int topNum = 0;
        int totalStudents = 0;
        double sumRate = 0.0;

        for (int i = 0; i < studentNumbers; i++) {
            double rate = Double.parseDouble(scanner.nextLine());

            sumRate += rate;

            if (rate < 3) {
                failNum++;
            } else if (rate < 4) {
                between34Num++;
            } else if (rate < 5) {
                between45Num++;
            } else {
                topNum++;
            }
        }
        System.out.printf("Top students: %.2f%%%n", topNum * 1.0 / studentNumbers * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", between45Num * 1.0 / studentNumbers * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", between34Num * 1.0 / studentNumbers * 100);
        System.out.printf("Fail: %.2f%%%n", failNum * 1.0 / studentNumbers * 100);
        System.out.printf("Average: %.2f%n", sumRate / studentNumbers);
    }
}
