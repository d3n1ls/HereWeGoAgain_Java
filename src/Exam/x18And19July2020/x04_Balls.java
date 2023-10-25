package Exam.x18And19July2020;

import java.util.Scanner;

public class x04_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ballsCount = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int other = 0;

        for (int i = 0; i < ballsCount; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    points += 5;
                    red++;
                    break;
                case "orange":
                    points += 10;
                    orange++;
                    break;
                case "yellow":
                    points += 15;
                    yellow++;
                    break;
                case "white":
                    points += 20;
                    white++;
                    break;
                case "black":
                    points = (int) Math.floor(points / 2.0);
                    black++;
                    break;
                default:
                    other++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Points from red balls: %d%n", red);
        System.out.printf("Points from orange balls: %d%n", orange);
        System.out.printf("Points from yellow balls: %d%n", yellow);
        System.out.printf("Points from white balls: %d%n", white);
        System.out.printf("Other colors picked: %d%n", other);
        System.out.printf("Divides from black balls: %d", black);
    }
}
