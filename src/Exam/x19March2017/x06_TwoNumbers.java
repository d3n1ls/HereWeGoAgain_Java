package Exam.x19March2017;

import java.util.Scanner;

public class x06_TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int lastNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int counter = 0;
        int one = 0;
        int two = 0;

        for (int i = firstNum; i >= lastNum; i--) {
            for (int j = firstNum; j >= lastNum; j--) {
                counter++;
                if (i + j == magicNum) {
                    sum = i + j;
                    one = i;
                    two = j;

                    break;
                }
            }
            if (sum == magicNum) {
                break;
            }
        }
        if (sum == magicNum) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, one, two, magicNum);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}
