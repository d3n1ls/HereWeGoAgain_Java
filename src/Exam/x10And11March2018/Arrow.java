package Exam.x10And11March2018;

import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString("_", n / 2 + 2)
                + "^"
                + repeatString("_", n / 2 + 2));
        System.out.println(repeatString("_", n / 2 + 1)
                + "/|\\"
                + repeatString("_", n / 2 + 1));

        for (int i = 0; i < n / 2; i++)
        {
            System.out.println(repeatString("_", n / 2 - i)
                    + "/" + repeatString(".", i)
                    + "|||" + repeatString(".", i)
                    + "\\" + repeatString("_", n / 2 - i));
        }
        System.out.println(repeatString("_", n / 2 - 2)
                + "/" + repeatString(".", 2)
                + "|||" + repeatString(".", 2)
                + "\\" + repeatString("_", n / 2 - 2));

        System.out.println(repeatString("_", n / 2 - 1)
                + "/" + repeatString(".", 1)
                + "|||"
                + repeatString(".", 1)
                + "\\"
                + repeatString("_", n / 2 - 1));


        for (int i = 0; i < n; i++)
        {
            System.out.println(repeatString("_", n / 2 + 1)
                    + "|||"+ repeatString("_", n / 2 + 1));
        }
        System.out.println(repeatString("_", n / 2 + 1)
                + "~~~"+ repeatString("_", n / 2 + 1));

        for (int i = 0; i < n / 2; i++)
        {
            System.out.println(repeatString("_", n / 2 - i)
                    + "//"
                    + repeatString(".", i)
                    + "!" + repeatString(".", i)
                    + "\\\\" + repeatString("_", n / 2 - i));
        }
    }

    public static String repeatString(String toRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text += toRepeat;
        }
        return text;
    }
}
