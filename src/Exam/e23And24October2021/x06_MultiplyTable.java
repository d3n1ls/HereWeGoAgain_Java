package Exam.e23And24October2021;

import java.util.Scanner;

public class x06_MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if(i<=k) {
                        System.out.printf("%d * %d * %d = %d%n", k, j, i, k * j * i);
                    }
                }
            }
        }
    }
}


