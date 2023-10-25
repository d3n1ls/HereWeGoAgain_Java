package NestedLoops.exercises;

import java.util.Scanner;

public class x05_SpecialNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean isValid = true;

        for (int i = 1111; i <= 9999; i++) {
            String number = "" + i;
            for (int j = 0; j < number.length(); j++) {
                int digit = Integer.parseInt("" + number.charAt(j));
                if (digit == 0) {
                    isValid = false;
                    break;
                }
                if (n % digit != 0) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.print(i + " ");
            }
            isValid = true;
        }
    }
}
