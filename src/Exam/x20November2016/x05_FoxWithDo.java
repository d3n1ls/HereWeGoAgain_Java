package Exam.x20November2016;

import java.util.Scanner;

public class x05_FoxWithDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        do {
            System.out.println(repeatStr("*", i + 1)
                    + "\\"
                    + repeatStr("-", 2 * n - 1 - 2 * i)
                    + "/"
                    + repeatStr("*", i + 1));
            i++;
        } while (i < n);

        for (int j = 1; j < n / 3 + 1; j++) {
            System.out.println("|"
                    + repeatStr("*", n / 2 - 1 + j)
                    + "\\"
                    + repeatStr("*", n + 2 - (2 * j))
                    + "/"
                    + repeatStr("*", n / 2 - 1 + j)
                    + "|");
        }
        i = 0;
        do {
            System.out.println(repeatStr("-", i + 1)
                    + "\\"
                    + repeatStr("*", 2 * n - 1 - 2 * i)
                    + "/"
                    + repeatStr("-", i + 1));
            i++;
        } while (i < n);
    }

    public static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
