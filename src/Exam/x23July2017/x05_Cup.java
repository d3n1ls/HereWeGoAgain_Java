package Exam.x23July2017;

import java.util.Scanner;

public class x05_Cup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = 5 * n;

        for (int i = 0; i < n / 2; i++) {
            String line = repeatString(".", n + i)
                    + repeatString("#", (col - (n * 2)) - (i * 2))
                    + repeatString(".", n + i);
            System.out.println(line);
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            String line = repeatString(".", ((n / 2) * 3) + i) + "#"
                    + repeatString(".", ((n * 2) - 2) - (i * 2)) + "#"
                    + repeatString(".", ((n / 2) * 3) + i);
            System.out.println(line);
        }
        String middle = repeatString(".", (col - n) / 2)
                + repeatString("#", n)
                + repeatString(".", (col - n) / 2);
        System.out.println(middle);

        for (int i = 0; i < n + 2; i++) {
            if (i == (n / 2)) {
                String word = repeatString(".", (col - 10) / 2)
                        + "D^A^N^C^E^"
                        + repeatString(".", (col - 10) / 2);
                System.out.println(word);
            } else {
                String lineTwo = repeatString(".", (n * 2) - 2)
                        + repeatString("#", col - ((n * 2) - 2) * 2)
                        + repeatString(".", (n * 2) - 2);
                System.out.println(lineTwo);
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
