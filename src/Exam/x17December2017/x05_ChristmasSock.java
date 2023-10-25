package Exam.x17December2017;

import java.util.Scanner;

public class x05_ChristmasSock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int dashes = 2;
        for (int i = 1; i <= n * 2; i++) {
            if (i == 1 || i == 3) {
                System.out.print('|');
                System.out.print(repeatString("-", n * 2));
                System.out.println('|');
            } else if (i == 2) {
                System.out.print('|');
                System.out.print(repeatString("*", n * 2));
                System.out.println('|');
            } else {
                System.out.print('|');
                System.out.print(repeatString("-", (n * 2 - dashes) / 2));
                System.out.print(repeatString("~", dashes));
                System.out.print(repeatString("-", (n * 2 - dashes) / 2));
                System.out.println('|');
                if (i <= (n * 2 - 3) / 2 + 3) {
                    dashes += 2;
                } else {
                    dashes -= 2;
                }
            }
        }
        for (int i = 0; i < n + 3; i++) {
            if (i <= n + 1) {
                System.out.print(repeatString("-", i));
                System.out.print('\\');
                if (i == n / 2) {
                    System.out.print(repeatString(".", ((n * 2 + 1) - 5) / 2));
                    System.out.print("MERRY");
                    System.out.print(repeatString(".", ((n * 2 + 1) - 5) / 2));
                } else if (i == n / 2 + 2) {
                    System.out.print(repeatString(".", ((n * 2 + 1) - 5) / 2));
                    System.out.print("X-MAS");
                    System.out.print(repeatString(".", ((n * 2 + 1) - 5) / 2));
                } else {
                    System.out.print(repeatString(".", n * 2 + 1));
                }
                System.out.println('\\');
            } else {
                System.out.print(repeatString("-", i));
                System.out.print('\\');
                System.out.print(repeatString("_", n * 2 + 1));
                System.out.print(')');
            }
        }
    }
    public static String repeatString(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
