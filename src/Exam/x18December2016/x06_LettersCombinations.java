package Exam.x18December2016;

import java.util.Scanner;

public class x06_LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char last = scanner.nextLine().charAt(0);
        char missed = scanner.nextLine().charAt(0);

        int counter = 0;
        for (char i = first; i <= last; i++) {
            for (char j = first; j <= last; j++) {
                for (char k = first; k <= last; k++) {
                    if (i != missed && j != missed && k != missed) {
                        System.out.print(i + "" + j + "" + k + "" + " ");
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
