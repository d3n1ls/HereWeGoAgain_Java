package Exam.x18March2017;

import java.util.Scanner;

public class x04_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMoves = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        double percentOne = 0;
        double percentTwo = 0;
        double percentThree = 0;
        double percentFour = 0;
        double percentFive = 0;
        double invalidNumber = 0;
        for (int i = 1; i <= countMoves; i++) {
            int intervals = Integer.parseInt(scanner.nextLine());

            if (intervals >= 0 && intervals <= 9) {
                sum += intervals * 0.20;
                percentOne++;
            } else if (intervals >= 10 && intervals <= 19) {
                sum += intervals * 0.30;
                percentTwo++;
            } else if (intervals >= 20 && intervals <= 29) {
                sum += intervals * 0.40;
                percentThree++;
            } else if (intervals >= 30 && intervals <= 39) {
                sum += 50;
                percentFour++;
            } else if (intervals >= 40 && intervals <= 50) {
                sum += 100;
                percentFive++;
            } else {
                sum = sum / 2;
                invalidNumber++;
            }
        }
        System.out.printf("%.2f%n", sum);
        System.out.printf("From 0 to 9: %.2f%%%n", percentOne * 100 / countMoves);
        System.out.printf("From 10 to 19: %.2f%%%n", percentTwo * 100 / countMoves);
        System.out.printf("From 20 to 29: %.2f%%%n", percentThree * 100 / countMoves);
        System.out.printf("From 30 to 39: %.2f%%%n", percentFour * 100 / countMoves);
        System.out.printf("From 40 to 50: %.2f%%%n", percentFive * 100 / countMoves);
        System.out.printf("Invalid numbers: %.2f%%%n", invalidNumber * 100 / countMoves);

    }
}
