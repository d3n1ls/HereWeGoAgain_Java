package Exam.x5November2017;

import java.util.Scanner;

public class x05_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = 3 * n + 6;
        int row = 3 * n + 1;

        for (int i = 0; i < n; i++) {
            System.out.print(repeatString(" ", n));
            System.out.println("~ ~ ~");
        }
        String lineOne = repeatString("=", col - 1) + " ";
        System.out.println(lineOne);

        for (int i = 0; i < n - 2; i++) {
            String line = "|"
                    + repeatString("~", n * 2 + 4)
                    + "|"
                    + repeatString(" ", n - 1)
                    + "|";
            if (i == (n - 2) / 2) {
                String lineJava = "|"
                        + repeatString("~", ((n * 2 + 4) - 4) / 2)
                        + "JAVA"
                        + repeatString("~", ((n * 2 + 4) - 4) / 2)
                        + "|"
                        + repeatString(" ", n - 1)
                        + "|";
                System.out.println(lineJava);
            } else {
                System.out.println(line);
            }
        }
        System.out.println(lineOne);

        for (int i = 0; i < n; i++) {
            String line = repeatString(" ", i)
                    + "\\"
                    + repeatString("@", (col - 2 - n) - i * 2)
                    + "/"
                    + repeatString(" ", i);
            System.out.println(line);
        }
        String lastLine = repeatString("=", col - n);
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
