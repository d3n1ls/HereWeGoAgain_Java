package Exam.More;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = Integer.parseInt(inp.nextLine());
        int i1 = num % 10;
        int k1 = num / 100;
        int j1 = (num / 10) % 10;

        for (int i = 1; i <= i1; i++) {
            for (int j = 1; j <= j1; j++) {
                for (int k = 1; k <= k1; k++) {
                    int sum = i * j * k;
                    // System.out.println(i + " * "+ j + " * " + k + " = " + i*j*k + ";");
                    System.out.printf("%d * %d * %d = %d;", i, j, k, sum);
                    System.out.println();
                }
            }
        }
    }
}
