package Exam.x16December2017;

import java.util.Scanner;

public class x06_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        int firstStart = firstNum / 1000;
        int secondStart = (firstNum / 100) % 10;
        int thirdStart = (firstNum / 10) % 10;
        int fourthStart = firstNum % 10;

        int firstEnd = secondNum / 1000;
        int secondEnd = (secondNum / 100) % 10;
        int thirdEnd = (secondNum / 10) % 10;
        int fourthEnd = secondNum % 10;

        for (int i = firstStart; i <= firstEnd; i++) {
            for (int j = secondStart; j <= secondEnd; j++) {
                for (int k = thirdStart; k <= thirdEnd; k++) {
                    for (int l = fourthStart; l <= fourthEnd; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
