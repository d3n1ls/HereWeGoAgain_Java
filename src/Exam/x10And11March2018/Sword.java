package Exam.x10And11March2018;

import java.util.Scanner;

public class Sword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int width = 2 * n + 1;

        int space = width / 2 - 1;
        int midSpace = 3;
        String letter = "";

        System.out.println(repeatString("#", space) + "/^\\" + repeatString("#", space));

        for (int i = 0; i < n / 2; i++) {
            space--;
            System.out.println(repeatString("#", space)
                    + "."
                    + repeatString(" ", midSpace)
                    + "."
                    + repeatString("#", space));
            midSpace += 2;
        }
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    letter = "S";
                    break;
                case 1:
                    letter = "O";
                    break;
                case 2:
                    letter = "F";
                    break;
                case 3:
                    letter = "T";
                    break;
            }

            if (i != 4) {
                System.out.println(repeatString("#", space)
                        + "|"
                        + repeatString(" ", n / 2)
                        + letter + repeatString(" ", n / 2)
                        + "|"
                        + repeatString("#", space));
            } else {
                System.out.println(repeatString("#", space)
                        + "|"
                        + repeatString(" ", n / 2)
                        + " "
                        + repeatString(" ", n / 2)
                        + "|"
                        + repeatString("#", space));
                for (int j = 0; j < n - 5; j++) {
                    System.out.println(repeatString("#", space)
                            + "|"
                            + repeatString(" ", n / 2)
                            + " "
                            + repeatString(" ", n / 2)
                            + "|"
                            + repeatString("#", space));
                }
                for (int k = 0; k < 1; k++) {
                    System.out.println(repeatString("#", space)
                            + "|"
                            + repeatString(" ", n / 2)
                            + "U"
                            + repeatString(" ", n / 2)
                            + "|"
                            + repeatString("#", space));
                    System.out.println(repeatString("#", space)
                            + "|"
                            + repeatString(" ", n / 2)
                            + "N"
                            + repeatString(" ", n / 2)
                            + "|"
                            + repeatString("#", space));
                    System.out.println(repeatString("#", space)
                            + "|"
                            + repeatString(" ", n / 2)
                            + "I"
                            + repeatString(" ", n / 2)
                            + "|"
                            + repeatString("#", space));

                }
            }
        }
        System.out.println("@" + repeatString("=", width - 2) + "@");
        for (int i = 0; i < n / 2; i++) {
            System.out.println(repeatString("#", space + 2)
                    + "|"
                    + repeatString(" ", (n / 2 + 1 + n / 2) - 4)
                    + "|"
                    + repeatString("#", space + 2));
        }
        System.out.println(repeatString("#", space + 2)
                + "\\"
                + repeatString(".", (n / 2 + 1 + n / 2) - 4)
                + "/"
                + repeatString("#", space + 2));
    }

    public static String repeatString(String toRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text += toRepeat;
        }
        return text;
    }
}
