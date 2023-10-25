package Exam.x17July2016;

import java.util.Scanner;

public class x05_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = 5 * n;
        int row = 3 * n + 2;

        String firstLine = repeatString(".", n)
                + repeatString("*", 3 * n)
                + repeatString(".", n);
        System.out.println(firstLine);

        for (int i = 0; i < n - 1; i++) {
            String line = repeatString(".", (n - 1) - i)
                    + "*"
                    + repeatString(".", (n * 3) + i * 2)
                    + "*"
                    + repeatString(".", (n - 1) - i);
            System.out.println(line);
        }

        System.out.println(repeatString("*", col));

        for (int i = 0; i < n * 2 + 1; i++) {
            String line = repeatString(".", 1 + i)
                    + "*"
                    + repeatString(".", (n * 5 - 4) - (i * 2))
                    + "*"
                    + repeatString(".", 1 + i);

            if (i == n * 2) {
                String lineLast = repeatString(".", 1 + i)
                        + "*"
                        + repeatString("*", (n * 5 - 4) - (i * 2))
                        + "*"
                        + repeatString(".", 1 + i);
                System.out.println(lineLast);
            } else {
                System.out.println(line);
            }
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
