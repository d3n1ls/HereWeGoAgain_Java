package Exam.x19March2017;

import java.util.Scanner;

public class x05_Hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = 2 * n + 1;

        System.out.println(repeatString("*", 2 * n + 1));
        System.out.println(".*" + repeatString(" ", col - 4) + "*.");

        for (int i = 0; i < n - 2; i++) {
            String line = repeatString(".", 2 + i)
                    + "*" + repeatString("@", (col - 6) - (i * 2)) + "*"
                    + repeatString(".", 2 + i);
            System.out.println(line);
        }

        String middle = repeatString(".", n) + "*" + repeatString(".", n);
        System.out.println(middle);

        for (int i = 0; i < n - 2; i++) {
            String line = repeatString(".", (n - 1) - i)
                    + "*"
                    + repeatString(" ", i) + "@" + repeatString(" ", i)
                    + "*"
                    + repeatString(".", (n - 1) - i);
            System.out.println(line);
        }

        String preLast = ".*" + repeatString("@", col - 4) + "*.";
        System.out.println(preLast);
        System.out.println(repeatString("*", 2 * n + 1));
    }

    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
