package Exam.x17December2017;

import java.util.Scanner;

public class x06_MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int firstNum = num % 10;
        num = num / 10;
        int secondNum = num % 10;
        num = num / 10;
        int lastNum = num;

        for (int i = 1; i <= firstNum; i++) {
            for (int j = 1; j <= secondNum; j++) {
                for (int k = 1; k <= lastNum; k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, i * j * k);
                }
            }
        }
    }
}
