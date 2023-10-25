package Exam.x20November2016;

import java.util.Scanner;

public class x05_Fox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String line = repeatString("*", 1 + i) + "\\"
                    + repeatString("-", (n * 2 - 1) - (i * 2)) + "/"
                    + repeatString("*", 1 + i);
            System.out.println(line);
        }
        for (int i = 0; i < n / 3; i++) {
            String line = "|" + repeatString("*", (n / 2) + i) + "\\"
                    + repeatString("*", n - (i * 2)) + "/"
                    + repeatString("*", (n / 2) + i) + "|";
            System.out.println(line);
        }
        for (int i = 0; i < n; i++) {
            String line = repeatString("-", 1 + i) + "\\"
                    + repeatString("*", (n * 2 - 1) - (i * 2)) + "/"
                    + repeatString("-", 1 + i);
            System.out.println(line);
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
