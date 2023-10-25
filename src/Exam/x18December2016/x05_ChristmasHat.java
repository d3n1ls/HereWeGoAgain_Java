package Exam.x18December2016;

import java.util.Scanner;

public class x05_ChristmasHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = (4 * n) + 1;
        int row = (2 * n) + 5;
        int rowInFor = 2 * n;
        int point = (col - 3) / 2;
        int dashes = 0;

        System.out.println(repeatString(".", point) +
                "/|\\" +
                repeatString(".", point));
        System.out.println(repeatString(".", point) +
                "\\|/" +
                repeatString(".", point));

        for (int i = 1; i <= rowInFor; i++) {
            System.out.println(repeatString(".", point) + "*" +
                    repeatString("-", dashes) + "*" +
                    repeatString("-", dashes) + "*" +
                    repeatString(".", point));
            dashes++;
            point--;
        }
        System.out.println(repeatString("*", col));
        System.out.println(repeatString("*.", col / 2) + "*");
        System.out.println(repeatString("*", col));
    }

    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
