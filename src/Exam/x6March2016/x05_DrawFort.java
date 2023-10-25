package Exam.x6March2016;

import java.util.Scanner;

public class x05_DrawFort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = 2 * n;

        String firstLine = "/" + repeatString("^", n / 2) + "\\"
                + repeatString("_", col - 4 - (n / 2) * 2)
                + "/" + repeatString("^", n / 2) + "\\";
        System.out.println(firstLine);

        for (int i = 1; i <= n - 2; i++) {
            String line = "|" + repeatString(" ", col - 2) + "|";
            if (i == n - 2 && n > 4) {
                String lineTwo = "|" + repeatString(" ", n / 2 + 1)
                        + repeatString("_", col - 4 - (n / 2) * 2)
                        + repeatString(" ", n / 2 + 1)
                        + "|";
                System.out.println(lineTwo);
            } else {
                System.out.println(line);
            }
        }

        String lastLine = "\\" + repeatString("_", n / 2) + "/"
                + repeatString(" ", col - 4 - (n / 2) * 2)
                + "\\" + repeatString("_", n / 2) + "/";
        System.out.println(lastLine);
    }

    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
