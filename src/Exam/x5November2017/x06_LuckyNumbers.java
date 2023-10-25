package Exam.x5November2017;

import java.util.Scanner;

public class x06_LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String happy = "";
        int sumOne = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        sumOne = i + j;
                        if (i + j == k + l) {
                            happy = i + "" + j + "" + k + "" + l + "";
                            if (n % sumOne == 0) {
                                System.out.print(happy + " ");
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
