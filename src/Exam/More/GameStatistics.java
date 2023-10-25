package Exam.More;

import java.util.Scanner;

public class GameStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mins = Integer.parseInt(scanner.nextLine());
        String nameOfPlayer = scanner.nextLine();

        if (mins == 0) {
            System.out.println("Match has just began!");
        } else if (mins < 45) {
            System.out.println("First half time.");

            if (mins <= 10) {
                System.out.printf("%s missed a penalty.%n", nameOfPlayer);
                if (mins % 2 == 0) {
                    System.out.printf("%s was injured after the penalty.", nameOfPlayer);
                }
            } else if (mins <= 35) {
                System.out.printf("%s received yellow card.%n", nameOfPlayer);
                if (mins % 2 != 0) {
                    System.out.printf("%s got another yellow card.", nameOfPlayer);
                }
            } else {
                System.out.printf("%s SCORED A GOAL !!!", nameOfPlayer);
            }
        } else {
            System.out.println("Second half time.");
            if (mins > 45 && mins <= 55) {
                System.out.printf("%s got a freekick.", nameOfPlayer);
                if (mins % 2 == 0) {
                    System.out.printf("%s missed the freekick.", nameOfPlayer);
                }
            } else if (mins > 55 && mins <= 80) {
                System.out.printf("%s missed a shot from corner.", nameOfPlayer);
                if (mins % 2 != 0) {
                    System.out.printf("%s has been changed with another player.");
                }
            } else if (mins > 80) {
                System.out.printf("%s SCORED A GOAL FROM PENALTY !!!", nameOfPlayer);
            }

        }
    }
}
