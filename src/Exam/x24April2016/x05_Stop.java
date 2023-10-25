package Exam.x24April2016;

import java.util.Scanner;

public class x05_Stop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int row = (n * 2) + 2;
        int col = (n * 2) + row + 1;
        int point = n;
        int dashesOut = col - row;
        int dashesIn = dashesOut - 2;
        int half = (row / 2) - 1;

        System.out.println(repeatString(".", point + 1) +
                repeatString("_", dashesOut) +
                repeatString(".", point + 1));

        for (int one = 1; one <= half; one++) {
            System.out.println(repeatString(".", point) + "//" +
                    repeatString("_", dashesIn) + "\\\\" +
                    repeatString(".", point));
            point--;
            dashesIn += 2;
        }
        int dashesWord = (dashesIn - 5) / 2;
        System.out.println("//" + repeatString("_", dashesWord) +
                "STOP!" +
                repeatString("_", dashesWord) + "\\\\");

        for (int two = 1; two <= half; two++) {
            System.out.println(repeatString(".", point) + "\\\\" +
                    repeatString("_", dashesIn) + "//" +
                    repeatString(".", point));
            point++;
            dashesIn -= 2;
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
