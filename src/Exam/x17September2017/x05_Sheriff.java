package Exam.x17September2017;

import java.util.Scanner;

public class x05_Sheriff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = 3 * n;
        int row = (2 * n) + 8;

        String firstLine = repeatString(".", (col - 1) / 2) + "x"
                + repeatString(".", (col - 1) / 2);

        String secondLine = repeatString(".", (col - 3) / 2) + "/x\\"
                + repeatString(".", (col - 3) / 2);

        String thirdLine = repeatString(".", (col - 3) / 2) + "x|x"
                + repeatString(".", (col - 3) / 2);

        System.out.printf("%s%n%s%n%s%n", firstLine, secondLine, thirdLine);

        for (int i = 0; i < n / 2 + 1; i++) {
            String line = repeatString(".", (n / 2) - i)
                    + repeatString("x", n + i)
                    + "|"
                    + repeatString("x", n + i)
                    + repeatString(".", (n / 2) - i);
            System.out.println(line);
        }
        for (int i = 0; i < n / 2; i++) {
            String line = repeatString(".", 1 + i)
                    + repeatString("x", ((col - 3) / 2) - i)
                    + "|"
                    + repeatString("x", ((col - 3) / 2) - i)
                    + repeatString(".", 1 + i);
            System.out.println(line);
        }

        System.out.println(secondLine);

        String fourthLine = repeatString(".", (col - 3) / 2) + "\\x/"
                + repeatString(".", (col - 3) / 2);
        System.out.println(fourthLine);

        for (int i = 0; i < n / 2 + 1; i++) {
            String line = repeatString(".", (n / 2) - i)
                    + repeatString("x", n + i)
                    + "|"
                    + repeatString("x", n + i)
                    + repeatString(".", (n / 2) - i);
            System.out.println(line);
        }

        for (int i = 0; i < n / 2; i++) {
            String line = repeatString(".", 1 + i)
                    + repeatString("x", ((col - 3) / 2) - i)
                    + "|"
                    + repeatString("x", ((col - 3) / 2) - i)
                    + repeatString(".", 1 + i);
            System.out.println(line);
        }
        System.out.printf("%s%n%s%n%s%n", thirdLine, fourthLine, firstLine);
    }

    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
