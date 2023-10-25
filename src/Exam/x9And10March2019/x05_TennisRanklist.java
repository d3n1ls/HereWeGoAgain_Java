package Exam.x9And10March2019;

import java.util.Scanner;

public class x05_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int wonPoints = 0;
        int wonTournaments = 0;

        for (int i = 0; i < tournamentsCount; i++) {
            String stageReached = scanner.nextLine();

            switch (stageReached) {
                case "W":
                    wonPoints += 2000;
                    wonTournaments++;
                    break;
                case "F":
                    wonPoints += 1200;
                    break;
                case "SF":
                    wonPoints += 720;
                    break;
            }
        }

        System.out.printf("Final points: %d%n", startingPoints + wonPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(wonPoints * 1.0 / tournamentsCount));
        System.out.printf("%.2f%%", wonTournaments * 1.0 / tournamentsCount * 100);
    }
}
