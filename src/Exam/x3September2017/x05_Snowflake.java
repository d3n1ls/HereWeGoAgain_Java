package Exam.x3September2017;

import java.util.Scanner;

public class x05_Snowflake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = 2 * n + 3;
        int row = 2 * n + 1;

        for (int i = 0; i < n - 1; i++) {
            String line = repeatString(".", i)
                    + "*"
                    + repeatString(".", n - i)
                    + "*"
                    + repeatString(".", n - i)
                    + "*"
                    + repeatString(".", i);
            System.out.println(line);
        }

        String preMiddle = repeatString(".", (col - 5) / 2)
                + "*****"
                + repeatString(".", (col - 5) / 2);
        System.out.println(preMiddle);
        System.out.println(repeatString("*", col));
        System.out.println(preMiddle);

        for (int i = n - 1; i > 0; i--) {
            String line = repeatString(".", i - 1)
                    + "*"
                    + repeatString(".", n - i + 1)
                    + "*"
                    + repeatString(".", n - i + 1)
                    + "*"
                    + repeatString(".", i - 1);
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
