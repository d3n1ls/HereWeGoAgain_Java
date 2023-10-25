package Exam.x7May2017;

import java.util.Scanner;

public class x06_NumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int special = Integer.parseInt(scanner.nextLine());
        int control = Integer.parseInt(scanner.nextLine());

        int number = 0;
        String num = "";
        for (int i = m; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                for (int k = l; k >= 1; k--) {
                    num = i + "" + j + "" + k + "";

                    number = Integer.parseInt(num);

                    if (number % 3 == 0) {
                        special = special + 5;
                    } else if (number % 10 == 5) {
                        special = special - 2;
                    } else if (number % 2 == 0) {
                        special = special * 2;
                    }

                    if (special >= control) {
                        break;
                    }
                }
                if (special >= control) {
                    break;
                }
            }
            if (special >= control) {
                break;
            }
        }
        if (special >= control) {
            System.out.printf("Yes! Control number was reached! Current special number is %d.", special);
        } else {
            System.out.printf("No! %d is the last reached special number.", special);
        }
    }
}
