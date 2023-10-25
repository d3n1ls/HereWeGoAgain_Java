package NestedLoops.moreExercises;

import java.util.Scanner;

public class x02_LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startLetter = scanner.nextLine().charAt(0);
        char endLetter = scanner.nextLine().charAt(0);
        char omittedLetter = scanner.nextLine().charAt(0);

        int combinationsCount = 0;

        for (int i = startLetter; i <= endLetter; i++) {
            for (int j = startLetter; j <= endLetter; j++) {
                for (int k = startLetter; k <= endLetter; k++) {
                    if (i != omittedLetter && j != omittedLetter && k != omittedLetter) {
                        combinationsCount++;
                        System.out.printf("%c%c%c ",
                                i, j, k);
                    }
                }
            }
        }
        System.out.println(combinationsCount);
    }
}
