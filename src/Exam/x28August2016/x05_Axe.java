package Exam.x28August2016;

import java.util.Scanner;

public class x05_Axe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = 5 * n;

        for (int i = 0; i < n; i++) {
            String line = repeatString("-", n * 3)
                    + "*"
                    + repeatString("-", i)
                    + "*"
                    + repeatString("-", col - (3 * n) - 2 - i);
            System.out.println(line);
        }
        for (int i = 0; i < n / 2; i++) {
            String line = repeatString("*", n * 3 + 1)
                    + repeatString("-", n - 1)
                    + "*"
                    + repeatString("-", n - 1);
            System.out.println(line);
        }
        for (int i = 0; i < (n / 2) - 1; i++) {
            String line = repeatString("-", (3 * n) - i)
                    + "*"
                    + repeatString("-", (n - 1) + (i * 2))
                    + "*"
                    + repeatString("-", (n - 1) - i);
            System.out.println(line);
        }

        int a = n / 2 - 1;
        String lastLine = repeatString("-", 3 * n - a)
                + repeatString("*", (n + 1) + (a * 2))
                + repeatString("-", n - 1 - a);
        System.out.println(lastLine);
    }

    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
