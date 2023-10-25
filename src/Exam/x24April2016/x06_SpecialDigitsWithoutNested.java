package Exam.x24April2016;

import java.util.Scanner;

public class x06_SpecialDigitsWithoutNested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            int first = i / 1000;
            int left = i % 1000;
            int second = left / 100;
            int leftT = left % 100;
            int third = leftT / 10;
            int fourth = leftT % 10;

            if (first == 0 || second == 0 || third == 0 || fourth == 0) {
                continue;
            }

            if (n % first == 0 && n % second == 0 && n % third == 0 && n % fourth == 0) {


                System.out.print(i + " ");
            }
        }
    }
}
