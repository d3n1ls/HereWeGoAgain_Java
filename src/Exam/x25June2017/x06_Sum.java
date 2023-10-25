package Exam.x25June2017;

import java.util.Scanner;

public class x06_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isFind = false;
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                for (int k = 1; k <= 30; k++) {
                    if (i < j && i < k && j < k) {
                        if (i + j + k == n) {
                            System.out.printf("%d + %d + %d = %d%n", i, j, k, n);
                            isFind = true;
                        }
                    }
                    if (i > j && i > k && j > k) {
                        if (i * j * k == n) {
                            System.out.printf("%d * %d * %d = %d%n", i, j, k, n);
                            isFind = true;
                        }
                    }
                }
            }
        }
        if (!isFind) {
            System.out.println("No!");
        }
    }
}
