package Exam.More;

import java.util.Scanner;

public class TwoNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int combinations = 0;

        for (int i = startNum; i >= endNum; i--) {
            for (int j = startNum; j >= endNum; j--) {
                combinations++;
                sum = i + j;
                if (sum==magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)",combinations,i,j,magicNum);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d",combinations,magicNum);
    }
}
