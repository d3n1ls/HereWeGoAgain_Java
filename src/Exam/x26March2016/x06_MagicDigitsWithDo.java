package Exam.x26March2016;

import java.util.Scanner;

public class x06_MagicDigitsWithDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magic = Integer.parseInt(scanner.nextLine());

        int result = 1;
        for (int i = 111111; i <= 999999; i++) {
            result = 1;
            int n = i;

            do {
                result = result * (n % 10);
                n = n / 10;
            } while (n > 0);
            if (result == magic) {
                System.out.print(i + " ");
            }
        }
    }
}
