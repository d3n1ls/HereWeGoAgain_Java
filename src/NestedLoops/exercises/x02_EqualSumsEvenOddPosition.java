package NestedLoops.exercises;

import java.util.Scanner;

public class x02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            int currentNumber = i;
            int oddSum = 0;
            int evenSum = 0;
            // Обхожда числото
            for (int pos = 6; pos > 0; pos--) {
                // Взимам последната цифра от числото
                int digit = currentNumber % 10;
                // Премахвам последната цифра от числото
                currentNumber /= 10;
                if (pos % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }
        }
    }
}
