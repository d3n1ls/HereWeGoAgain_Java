package Exam.x25June2017;

import java.util.Scanner;

public class x05_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int width = (4 * n) + 1;
        int height = (2 * n) + 1;
        int dots = 1;
        int hash = 2 * n - 1;
        int spaces = 1;

        System.out.println(repeatString("#", width));

        for (int row = 1; row <= n; row++) {
            if ((n / 2) + 1 == row) {
                String line = repeatString(".", dots)
                        + repeatString("#", hash)
                        + repeatString(" ", (spaces - 3) / 2)
                        + "(@)"
                        + repeatString(" ", (spaces - 3) / 2)
                        + repeatString("#", hash)
                        + repeatString(".", dots);
                System.out.println(line);

                dots++;
                hash -= 2;
                spaces += 2;
            } else {
                String line = repeatString(".", dots)
                        + repeatString("#", hash)
                        + repeatString(" ", spaces)
                        + repeatString("#", hash)
                        + repeatString(".", dots);
                System.out.println(line);

                dots++;
                hash -= 2;
                spaces += 2;
            }
        }

        hash = 2 * n - 1;
        for (int row = 1; row <= n; row++) {
            String line = repeatString(".", dots)
                    + repeatString("#", hash)
                    + repeatString(".", dots);
            System.out.println(line);

            dots++;
            hash -= 2;
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
