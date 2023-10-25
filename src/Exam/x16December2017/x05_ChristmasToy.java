package Exam.x16December2017;

import java.util.Scanner;

public class x05_ChristmasToy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int width = 5 * n;
        int length = 2 * n + 3;

        System.out.println(repeatString("-", n * 2)
                + repeatString("*", n)
                + repeatString("-", n * 2));

        for (int i = 0; i < n / 2; i++) {
            String line = repeatString("-", (n * 2) - 2 - i * 2)
                    + repeatString("*", i + 1)
                    + repeatString("&", (n + 2) + i * 2)
                    + repeatString("*", i + 1)
                    + repeatString("-", (n * 2) - 2 - i * 2);
            System.out.println(line);
        }
        for (int i = 0; i < n / 2; i++) {
            String line = repeatString("-", n - 1 - i)
                    + "**"
                    + repeatString("~", (3 * n - 2) + i * 2)
                    + "**"
                    + repeatString("-", n - 1 - i);
            System.out.println(line);
        }
        System.out.println(repeatString("-", n / 2)
                + "*"
                + repeatString("|", width - ((n / 2) * 2) - 2)
                + "*"
                + repeatString("-", n / 2));

        for (int i = 0; i < n / 2; i++) {
            String line = repeatString("-", n / 2 + i)
                    + "**"
                    + repeatString("~", width - 4 - n - 2 * i)
                    + "**"
                    + repeatString("-", n / 2 + i);
            System.out.println(line);
        }

        for (int i = 0; i < n / 2; i++) {
            String line = repeatString("-", n + 2 * i)
                    + repeatString("*", n / 2 - i)
                    + repeatString("&", n * 2 - 2 * i)
                    + repeatString("*", n / 2 - i)
                    + repeatString("-", n + 2 * i);
            System.out.println(line);
        }
        System.out.println(repeatString("-", n * 2)
                + repeatString("*", n)
                + repeatString("-", n * 2));
    }
    public static String repeatString(String toRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text += toRepeat;
        }
        return text;
    }
}
