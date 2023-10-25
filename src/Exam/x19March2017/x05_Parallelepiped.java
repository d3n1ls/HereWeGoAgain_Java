package Exam.x19March2017;

import java.util.Scanner;

public class x05_Parallelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int col = 3 * n + 1;
        int row = 4 * n + 3;

        String firstLine = "+" + repeatString("~", n - 2) + "+"
                + repeatString(".", (n * 2) + 1);
        System.out.println(firstLine);

        for (int i = 0; i < 2 * n + 1; i++) {
            String line = "|" + repeatString(".", i) + "\\"
                    + repeatString("~", n - 2) + "\\"
                    + repeatString(".", (n * 2) - i);
            System.out.println(line);
        }
        for (int i = 0; i < 2 * n + 1; i++) {
            String line = repeatString(".", i) + "\\"
                    + repeatString(".", (n * 2) - i)
                    + "|" + repeatString("~", n - 2) + "|";
            System.out.println(line);
        }

        String lastLine = repeatString(".", (n * 2) + 1)
                + "+" + repeatString("~", n - 2) + "+";
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
