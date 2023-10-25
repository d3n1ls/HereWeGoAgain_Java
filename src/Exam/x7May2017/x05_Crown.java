package Exam.x7May2017;

import java.util.Scanner;

public class x05_Crown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = (2 * n) - 1;

        String firstLine = "@"
                + repeatString(" ", (col - 3) / 2) + "@"
                + repeatString(" ", (col - 3) / 2) + "@";
        System.out.println(firstLine);

        String secondLine = "**"
                + repeatString(" ", ((col - 3) / 2) - 1) + "*"
                + repeatString(" ", ((col - 3) / 2) - 1) + "**";
        System.out.println(secondLine);

        for (int i = 0; i < (n / 2) - 2; i++) {
            String line = "*" + repeatString(".", i + 1) + "*"
                    + repeatString(" ", (n - 5) - (i * 2))
                    + "*" + repeatString(".", 1 + (i * 2)) + "*"
                    + repeatString(" ", (n - 5) - (i * 2))
                    + "*" + repeatString(".", i + 1) + "*";
            System.out.println(line);
        }

        String thirdLine = "*" + repeatString(".", (n / 2) - 1) + "*"
                + repeatString(".", n - 3) + "*"
                + repeatString(".", (n / 2) - 1) + "*";
        System.out.println(thirdLine);

        String fourthLine = "*" + repeatString(".", n / 2)
                + repeatString("*", (n / 2) - 2) + "."
                + repeatString("*", (n / 2) - 2)
                + repeatString(".", n / 2) + "*";
        System.out.println(fourthLine);

        for (int i = 0; i < 2; i++) {
            System.out.println(repeatString("*", col));
        }

    }
    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
