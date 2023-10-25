package Exam.x9And10March2019;

import java.util.Scanner;

public class x06_BasketballTournament01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine();
        int wins = 0;
        int lost = 0;
        int allMatches = 0;

        while (!tournamentName.equals("End of tournaments")) {
            int matches = Integer.parseInt(scanner.nextLine());
            allMatches += matches;
            for (int i = 1; i <= matches; i++) {
                int myPoints = Integer.parseInt(scanner.nextLine());
                int otherPoints = Integer.parseInt(scanner.nextLine());
                if (myPoints > otherPoints) {
                    wins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, myPoints - otherPoints);
                } else {
                    lost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, otherPoints - myPoints);
                }
            }
            tournamentName = scanner.nextLine();
        }
        double winsPercent = wins * 1.0 / allMatches / 0.01;
        double lostPercent = lost * 1.0 / allMatches / 0.01;
        System.out.printf("%.2f%% matches win%n", winsPercent);
        System.out.printf("%.2f%% matches lost", lostPercent);
    }
}
