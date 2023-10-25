package Exam.More;

import java.util.Scanner;

public class FallenInLove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String sideDots;
        String leaves = "";
        String centerDots = "";
        String middleDots;

        for (int i = 0; i <= 2 * n; i++) {
            if (i >= n) {
                sideDots = repeatStr(".", (i - n) * 2 + 1);
            } else {
                sideDots = "";
            }

            if (i > n) {
                leaves = repeatStr("~", 2 * n - i);
            } else if (i > 0) {
                leaves = repeatStr("~", i);
            }

            if (i < n) {
                middleDots = repeatStr(".", (n - i) * 2);
            } else {
                middleDots = "";
            }

            if (i > n) {
                centerDots = repeatStr(".", (2 * n - i) * 2);
            } else if (i >= 0) {
                centerDots = repeatStr(".", 2 * i);
            }

            if (i < n) {
                System.out.printf("%s#%s#%s#%s#%s#%s#%s%n", sideDots, leaves,
                        middleDots, centerDots, middleDots, leaves, sideDots);
            } else {
                System.out.printf("%s#%s%s#%s#%s%s#%s%n", sideDots, leaves,
                        middleDots, centerDots, middleDots, leaves, sideDots);
            }
        }

        String stick = repeatStr(".", 2 * n + 2) + "##"
                + repeatStr(".", 2 * n + 2);

        for (int i = 0; i < n; i++) {
            System.out.println(stick);
        }
    }

    private static String repeatStr(String strToRepeat, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(strToRepeat);
        }

        return sb.toString();
    }
}
