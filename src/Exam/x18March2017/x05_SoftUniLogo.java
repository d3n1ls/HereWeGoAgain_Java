package Exam.x18March2017;

import java.util.Scanner;

public class x05_SoftUniLogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = (12 * n) - 5;

        for (int i = 0; i < n * 2; i++) {
            String line = repeatString(".", ((col - 1) / 2) - (3 * i))
                    + repeatString("#", 1 + (6 * i))
                    + repeatString(".", ((col - 1) / 2) - (3 * i));
            System.out.println(line);
        }
        for (int i = 0; i < n - 1; i++) {
            String middle = "|" + repeatString(".", 2 + (3 * i))
                    + repeatString("#", (col - 6) - (6 * i))
                    + repeatString(".", 3 + (3 * i));
            System.out.println(middle);
        }
        for (int i = 0; i < n - 2; i++) {
            String line = "|" + repeatString(".", (3 * n - 3) - 1)
                    + repeatString("#", col - ((3 * n - 3) * 2))
                    + repeatString(".", 3 * n - 3);
            System.out.println(line);
        }

        String middleThree = "@" + repeatString(".", (3 * n - 3) - 1)
                + repeatString("#", col - ((3 * n - 3) * 2))
                + repeatString(".", 3 * n - 3);
        System.out.println(middleThree);
    }

    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
