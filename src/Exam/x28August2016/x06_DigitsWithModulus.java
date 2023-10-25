package Exam.x28August2016;

import java.util.Scanner;

public class x06_DigitsWithModulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oneNum = n / 100;
        int left = n % 100;
        int twoNum = left / 10;
        int threeNum = left % 10;

        int sum = n;
        for (int i = 0; i < oneNum + twoNum; i++) {
            for (int j = 0; j < oneNum + threeNum; j++) {
                if (n % 5 == 0) {
                    n = n - oneNum;
                    System.out.print(n + " ");
                } else if (n % 3 == 0) {
                    n = n - twoNum;
                    System.out.print(n + " ");
                } else {
                    n = n + threeNum;
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }
}
