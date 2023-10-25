package NestedLoops.moreExercises;

import java.util.Scanner;

public class x14_PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 97; k < 97 + L; k++) {
                    for (int l = 97; l < 97 + L; l++) {
                        for (int m = 1; m <= N; m++) {
                            if (m > i && m > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, l, m);
                            }
                        }
                    }
                }
            }
        }
    }
}
