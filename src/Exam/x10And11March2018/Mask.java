package Exam.x10And11March2018;

import java.util.Scanner;

public class Mask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n - 1; i++) {
            System.out.println(repeatString(" ", n - i - 2)
                    + "/" + repeatString(" ", i)
                    + "|  |"
                    + repeatString(" ", i)
                    + "\\");
        }

        System.out.println(repeatString("-", n * 2 + 2));

        System.out.println("|"
                + repeatString(" ", n / 2 - 1)
                + "_" + repeatString(" ", n + 1)
                + "_" + repeatString(" ", n / 2 - 1)
                + "|");

        System.out.println("|"
                + repeatString(" ", n / 2 - 2)
                + " @ " + repeatString(" ", n - 1)
                + " @ " + repeatString(" ", n / 2 - 2)
                + "|");

        for (int i = 0; i < n / 2; i++) {
            System.out.println("|" + repeatString(" ", n * 2) + "|");
        }

        System.out.println("|" + repeatString(" ", n - 1) + "OO" + repeatString((" "), n - 1) + "|");
        System.out.println("|" + repeatString(" ", n - 2) + "/  \\" + repeatString((" "), n - 2) + "|");
        System.out.println("|" + repeatString(" ", n - 2) + "||||" + repeatString((" "), n - 2) + "|");

        for (int i = 0; i < n; i++) {
            System.out.println(repeatString("\\", i + 1)
                    + repeatString("`", (n * 2) - (i * 2))
                    + repeatString("/", i + 1));
        }

        System.out.println(repeatString("\\", n + 1) + repeatString(("/"), n + 1));
    }

    public static String repeatString(String toRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text += toRepeat;
        }
        return text;
    }
}
