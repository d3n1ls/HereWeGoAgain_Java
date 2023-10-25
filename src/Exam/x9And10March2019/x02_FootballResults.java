package Exam.x9And10March2019;

import java.util.Scanner;

public class x02_FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int winsCount = 0;
        int drawsCount = 0;
        int defeatsCount = 0;

        for (int i = 0; i < 3; i++) {
            String result = scanner.nextLine();

            int ourGoals = Integer.parseInt(String.valueOf(result.charAt(0)));
            int opponentGoals = Integer.parseInt(String.valueOf(result.charAt(2)));

            if (ourGoals > opponentGoals) {
                winsCount++;
            } else if (opponentGoals > ourGoals) {
                defeatsCount++;
            } else {
                drawsCount++;
            }
        }

        System.out.printf("Team won %d games.%n", winsCount);
        System.out.printf("Team lost %d games.%n", defeatsCount);
        System.out.printf("Drawn games: %d", drawsCount);
    }
}
