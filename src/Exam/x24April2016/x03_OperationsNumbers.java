package Exam.x24April2016;

import java.util.Scanner;

public class x03_OperationsNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String o = scanner.nextLine();

        int result = 0;
        double resultD = 0.0;

        if ("+".equals(o)) {
            result = n1 + n2;
        } else if ("-".equals(o)) {
            result = n1 - n2;
        } else if ("*".equals(o)) {
            result = n1 * n2;
        } else if ("/".equals(o)) {
            resultD = (double) n1 / n2;
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                System.out.printf("%d %s %d = %.2f", n1, o, n2, resultD);
            }
        } else {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                result = n1 % n2;
                System.out.printf("%d %s %d = %d", n1, o, n2, result);
            }
        }
        if ("+".equals(o) || "-".equals(o) || "*".equals(o)) {
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", n1, o, n2, result);
            } else {
                System.out.printf("%d %s %d = %d - odd", n1, o, n2, result);
            }
        }
    }
}
