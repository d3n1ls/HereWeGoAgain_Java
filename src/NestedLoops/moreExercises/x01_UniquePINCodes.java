package NestedLoops.moreExercises;

import java.util.Scanner;

public class x01_UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= firstNum; i++) {
            for (int j = 1; j <= secondNum; j++) {
                for (int k = 1; k <= thirdNum; k++) {
                    if ((i % 2 == 0) && (k % 2 == 0) && (j >= 2 && j <= 7)) {
                        boolean isPrime = true;

                        for (int l = 2; l < j; l++) {
                            if (j % l == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.println(i + " " + j + " " + k);
                        }
                    }
                }
            }
        }
    }
}
