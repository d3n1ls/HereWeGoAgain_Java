package Exam.x22And23August2020;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstDigitFirstNum = Integer.parseInt(scan.nextLine());
        int secondDigitFirstNum = Integer.parseInt(scan.nextLine());
        int firstDigitSecondNum = Integer.parseInt(scan.nextLine());
        int secondDigitSecondNum = Integer.parseInt(scan.nextLine());
        scan.close();
        int count = 0;

        if ((firstDigitFirstNum % 2) != 0) {
            firstDigitFirstNum++;
        }
        if ((firstDigitSecondNum % 2) != 0) {
            firstDigitSecondNum++;
        }

        for (int i = firstDigitFirstNum; i <= 8; i++, i++) {
            for (int j = 9; j >= secondDigitFirstNum; j--, j--) {
                for (int j2 = firstDigitSecondNum; j2 <= 8; j2++, j2++) {
                    for (int k = 9; k >= secondDigitSecondNum; k--, k--) {
                        if ((i == j2) && (j == k)) {
                            System.out.println("Cannot change the same player.");
                        } else {
                            System.out.printf("%d%d - %d%d\n", i, j, j2, k);
                            count++;
                        }
                        if (count == 6) {
                            return;
                        }
                    }
                }
            }
        }
    }
}
