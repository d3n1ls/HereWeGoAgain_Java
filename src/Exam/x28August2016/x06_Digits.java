package Exam.x28August2016;

import java.util.Scanner;

public class x06_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int num = Integer.valueOf(word);
        char one = word.charAt(0);
        int oneNum = one - 48;
        char two = word.charAt(1);
        int twoNum = two - 48;
        char three = word.charAt(2);
        int threeNum = three - 48;

        int sum = num;
        for (int i = 0; i < oneNum + twoNum; i++) {
            for (int j = 0; j < oneNum + threeNum; j++) {
                if (num % 5 == 0) {
                    num = num - oneNum;
                    System.out.print(num + " ");
                } else if (num % 3 == 0) {
                    num = num - twoNum;
                    System.out.print(num + " ");
                } else {
                    num = num + threeNum;
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}
