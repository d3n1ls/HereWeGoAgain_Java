package NestedLoops.moreExercises;

import java.util.Scanner;

public class x07_SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = Integer.parseInt(scanner.nextLine());
        int B = Integer.parseInt(scanner.nextLine());
        int maxPass = Integer.parseInt(scanner.nextLine());

        int passwordsCount = 0;

        for (int a = 35; a <= 55; a++) {
            for (int b = 64; b <= 96; b++) {
                for (int x = 1; x <= A; x++) {
                    for (int y = 1; y <= B; y++) {
                        passwordsCount++;

                        System.out.printf("%c%c%d%d%c%c|", (char)a, (char)b, x, y, (char)b, (char)a);

                        if (passwordsCount == maxPass) {
                            return;
                        }
                        a++;
                        b++;

                        if (a > 55) {
                            a = 35;
                        }
                        if (b > 96) {
                            b = 64;
                        }
                        if (x == A && y == B) {
                            return;
                        }
                    }
                }
            }
        }
    }
}
