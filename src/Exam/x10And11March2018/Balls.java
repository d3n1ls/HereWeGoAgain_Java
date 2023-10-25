package Exam.x10And11March2018;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pulledBalls = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int redCounter = 0;
        int orangeCounter = 0;
        int yellowCounter = 0;
        int whiteCounter = 0;
        int otherCounter = 0;
        int dividesFromBlackBalls = 0;

        for (int i = 0; i < pulledBalls; i++) {
            String ballsColor = scanner.nextLine();
            if ("red".equals(ballsColor)) {
                redCounter++;
                points += 5;
            } else if ("orange".equals(ballsColor)) {
                orangeCounter++;
                points += 10;
            } else if ("yellow".equals(ballsColor)) {
                yellowCounter++;
                points += 15;
            } else if ("white".equals(ballsColor)) {
                whiteCounter++;
                points += 20;
            } else if ("black".equals(ballsColor)) {
                dividesFromBlackBalls++;
                points /= 2;
            } else {
                otherCounter++;
            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Points from red balls: %d%n", redCounter);
        System.out.printf("Points from orange balls: %d%n", orangeCounter);
        System.out.printf("Points from yellow balls: %d%n", yellowCounter);
        System.out.printf("Points from white balls: %d%n", whiteCounter);
        System.out.printf("Other colors picked: %d%n", otherCounter);
        System.out.printf("Divides from black balls: %d%n", dividesFromBlackBalls);
    }
}
