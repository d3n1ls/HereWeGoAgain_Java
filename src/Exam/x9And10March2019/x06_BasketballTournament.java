package Exam.x9And10March2019;

import java.util.Scanner;

public class x06_BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int winsCount = 0;
        int defeatsCount = 0;
        int totalMatchesCount = 0;

        while (true) {
            String tournamentName = scanner.nextLine();

            if (tournamentName.equals("End of tournaments")) {
                break;
            }

            int matchesCount = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < matchesCount; i++) {
                int ourTeamPoints = Integer.parseInt(scanner.nextLine());
                int opponentTeamPoints = Integer.parseInt(scanner.nextLine());
                totalMatchesCount++;

                if (ourTeamPoints > opponentTeamPoints) {
                    System.out.printf("Game %d of tournament %s: win with %d points.%n",
                            i + 1, tournamentName, ourTeamPoints - opponentTeamPoints);
                    winsCount++;
                } else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n",
                            i + 1, tournamentName, opponentTeamPoints - ourTeamPoints);
                    defeatsCount++;
                }
            }
        }

        System.out.printf("%.2f%% matches win%n", winsCount * 1.0 / totalMatchesCount * 100);
        System.out.printf("%.2f%% matches lost%n", defeatsCount * 1.0 / totalMatchesCount * 100);
    }
}
