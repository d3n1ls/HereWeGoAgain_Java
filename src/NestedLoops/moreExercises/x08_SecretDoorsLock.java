package NestedLoops.moreExercises;

import java.util.Scanner;

public class x08_SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstUpperBorder = Integer.parseInt(scanner.nextLine());
        int secondUpperBorder = Integer.parseInt(scanner.nextLine());
        int thirdUpperBorder = Integer.parseInt(scanner.nextLine());
        boolean isPrime = true;

        for (int i = 1; i <= firstUpperBorder; i++) {
            for (int j = 1; j <= secondUpperBorder; j++) {
                for (int k = 1; k <= thirdUpperBorder; k++) {
                    if ((k % 2 == 0) && (i % 2 == 0) && ((j >= 2) && (j <= 7))) {
                        isPrime = true;

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
