package NestedLoops.exercises;

import java.util.Scanner;

public class x02_EqualSumsEvenOddPosition01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            int oddSum = 0;
            int evenSum = 0;
            String currentNumber = "" + i;

            for (int pos = 0; pos < currentNumber.length(); pos++) {
                int digit = Integer.parseInt("" + currentNumber.charAt(pos));

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
