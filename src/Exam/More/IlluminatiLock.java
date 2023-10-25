package Exam.More;

import java.util.Scanner;

public class IlluminatiLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String outsideDots = repeatStr(".", n);
        String sideDots = "";
        String midSection = "#" + repeatStr(".", n - 2) + "#";

        String lineStartEnd = outsideDots + repeatStr("#", n) + outsideDots;

        System.out.println(lineStartEnd);

        for (int i = 1; i < n; i++) {
            if (i <= n / 2) {
                int numSideDots = n - 2 * i;
                outsideDots = repeatStr(".", numSideDots);
                sideDots = repeatStr(".", n - numSideDots - 2);
            } else if (i > n / 2 + 1) {
                int numSideDots = 2 * i - n;
                outsideDots = repeatStr(".", 2 * i - n);
                sideDots = repeatStr(".", n - numSideDots - 2);
            }

            System.out.println(outsideDots + "##" + sideDots + midSection + sideDots + "##" + outsideDots);
        }

        System.out.println(lineStartEnd);
    }

    private static String repeatStr(String strToRepeat, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(strToRepeat);
        }

        return sb.toString();
    }
}
