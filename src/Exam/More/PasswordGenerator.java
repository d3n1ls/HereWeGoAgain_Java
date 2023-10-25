package Exam.More;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int lastLetIndex = Integer.parseInt(scanner.nextLine());
        char lastLetter = (char) ('a' + lastLetIndex);

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (char c1 = 'a'; c1 < lastLetter; c1++) {
                    for (char c2 = 'a'; c2 < lastLetter; c2++) {
                        for (int k = Math.max(i, j) + 1; k <= n; k++) {
                            System.out.printf("%d%d%s%s%d ", i, j, c1, c2, k);
                        }
                    }
                }
            }
        }
    }
}
