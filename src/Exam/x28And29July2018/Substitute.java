package Exam.x28And29July2018;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());
        int fourthNum = Integer.parseInt(scan.nextLine());

        int counter = 0;

        for (int i = firstNum; i <= 8; i++) {
            for (int j = 9; j >= secondNum; j--) {
                for (int k = thirdNum; k <= 8; k++) {
                    for (int l = 9; l >= fourthNum; l--) {
                        if (i % 2 == 0 && j % 2 == 1 && k % 2 == 0 && l % 2 == 1) {
                            if (i == k && j == l) {
                                System.out.printf("Cannot change the same player.%n");
                            } else {
                                System.out.printf("%d%d - %d%d%n", i,j,k,l);
                                counter++;
                            }
                            if (counter == 6) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
