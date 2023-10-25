package Exam.More;

import java.util.Scanner;

public class Multiplication01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int multiplication = 0;
        boolean isEquals = false;

        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                for (int k = 1; k <= 30; k++) {
                    sum = i + j + k;
                    multiplication = i * j * k;

                    if (i < j && j < k && sum == controlNum) {
                        isEquals = true;
                        System.out.printf("%d + %d + %d = %d%n", i, j, k, controlNum);

                    } else if (i > j && j > k && multiplication == controlNum) {
                        isEquals = true;
                        System.out.printf("%d * %d * %d = %d%n", i, j, k, controlNum);
                    }
                }
            }
        }
        if (!isEquals) {
            System.out.println("No!");
        }
    }
}
