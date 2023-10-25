package Exam.More;

import java.util.Scanner;

public class LetterCombinationsUsingStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startLetter = scanner.nextLine().charAt(0);
        char endLetter = scanner.nextLine().charAt(0);
        char ignoreLetter = scanner.nextLine().charAt(0);

        int combinationsFound = 0;

        StringBuilder sb = new StringBuilder();

        for (char i = startLetter; i <= endLetter; i++) {
            if (i != ignoreLetter) {
                for (char j = startLetter; j <= endLetter; j++) {
                    if (j != ignoreLetter) {
                        for (char k = startLetter; k <= endLetter; k++) {
                            if (k != ignoreLetter) {
                                sb.append(i);
                                sb.append(j);
                                sb.append(k);
                                sb.append(" ");
                                combinationsFound++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(sb.append(combinationsFound));
    }
}
