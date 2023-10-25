package Exam.e23And24October2021;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigitFirstNumStart = Integer.parseInt(scanner.nextLine());
        int secondDigitFirstNumStart = Integer.parseInt(scanner.nextLine());
        int firstDigitSecondNumStart = Integer.parseInt(scanner.nextLine());
        int secondDigitSecondNumStart = Integer.parseInt(scanner.nextLine());

        int substitutesCount = 0;

        for (int i = firstDigitFirstNumStart; i <= 8; i++) {
            for (int j = 9; j >= secondDigitFirstNumStart; j--) {
                for (int k = firstDigitSecondNumStart; k <= 8; k++) {
                    for (int l = 9; l >= secondDigitSecondNumStart; l--) {
                        if ((i % 2 == 0 && j % 2 != 0) && (k % 2 == 0 && l % 2 != 0)) {
                            if (!String.format("%d%d", i, j).equals(String.format("%d%d", k, l))) {
                                substitutesCount++;

                                System.out.printf("%d%d - %d%d%n", i, j, k, l);

                                if (substitutesCount == 6) {
                                    return;
                                }
                            } else {
                                System.out.println("Cannot change the same player.");
                            }
                        }
                    }
                }
            }
        }
    }
}
