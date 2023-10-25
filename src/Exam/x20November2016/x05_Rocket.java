package Exam.x20November2016;

import java.util.Scanner;

public class x05_Rocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = 3 * n;
        int point = (col - 2) / 2;
        int space = 0;
        int stars = (n * 2) - 2;

        for (int i = 1; i <= n; i++) {
            System.out.println(repeatString(".", point) + "/" +
                    repeatString(" ", space) + "\\" +
                    repeatString(".", point));
            point--;
            space += 2;
        }
        System.out.println(repeatString(".", point + 1) +
                repeatString("*", n * 2) +
                repeatString(".", point + 1));

        for (int j = 1; j <= n * 2; j++)
            System.out.println(repeatString(".", point + 1) + "|" +
                    repeatString("\\", (n * 2) - 2) + "|" +
                    repeatString(".", point + 1));

        for (int k = 1; k <= n / 2; k++) {
            System.out.println(repeatString(".", point + 1) + "/" +
                    repeatString("*", stars) + "\\" +
                    repeatString(".", point + 1));
            point--;
            stars += 2;
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
