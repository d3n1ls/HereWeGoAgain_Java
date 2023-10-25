package Exam.x18March2017;

import java.util.Scanner;

public class x06_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());

        String comb = "";
        int counter = 0;
        int sum = 0;
        for (int i = m; i <= n; i++) {
            for (int j = m; j <= n; j++) {
                counter++;
                sum = i + j;
                if (i + j == magic) {
                    comb = i + "" + j + "";
                    System.out.printf("Combination N:%d ", counter);
                    System.out.printf("(%d + %d = %d)", i, j, magic);
                    break;
                }
            }
            if (sum == magic) {
                break;
            }
        }
        if ("".equals(comb)) {
            System.out.printf("%d combinations - neither equals %d", counter, magic);
        }
    }
}
