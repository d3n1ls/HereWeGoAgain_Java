package Exam.x17December2017;

import java.util.Scanner;

public class x06_MultiplyTableASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numAsString = scanner.nextLine();

        int firstNum = numAsString.charAt(2) - 48;
        int secondNum = numAsString.charAt(1) - 48;
        int lastNum = numAsString.charAt(0) - 48;

        for (int i = 1; i <= firstNum; i++) {
            for (int j = 1; j <= secondNum; j++) {
                for (int k = 1; k <= lastNum; k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, i * j * k);
                }
            }
        }
    }
}
