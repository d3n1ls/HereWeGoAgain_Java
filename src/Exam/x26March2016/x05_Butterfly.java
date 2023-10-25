package Exam.x26March2016;

import java.util.Scanner;

public class x05_Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int rowFormula = n - 2;
        int leftRightSymbols = n - 2;
        int leftRight = n - 1;

        for (int i = 1; i <= rowFormula; i++) {
            if (i % 2 != 0) {
                System.out.println(repeatString("*", leftRightSymbols) +
                        "\\" + " " + "/" +
                        repeatString("*", leftRightSymbols));
            } else {
                System.out.println(repeatString("-", leftRightSymbols) +
                        "\\" + " " + "/" +
                        repeatString("-", leftRightSymbols));
            }
        }

        System.out.println(repeatString(" ", leftRight) +
                "@" +
                repeatString(" ", leftRight));

        for (int j = 1; j <= rowFormula; j++) {
            if (j % 2 != 0) {
                System.out.println(repeatString("*", leftRightSymbols) +
                        "/" + " " + "\\" +
                        repeatString("*", leftRightSymbols));
            } else {
                System.out.println(repeatString("-", leftRightSymbols) +
                        "/" + " " + "\\" +
                        repeatString("-", leftRightSymbols));
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
