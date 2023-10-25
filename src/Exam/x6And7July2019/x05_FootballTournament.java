package Exam.x6And7July2019;

import java.util.Scanner;

public class x05_FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int matchesCount = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int won = 0;
        int draw = 0;
        int defeat = 0;

        if (matchesCount <= 0) {
            System.out.printf("%s hasn't played any games during this season.", teamName);
        } else {
            for (int i = 0; i < matchesCount; i++) {
                char result = scanner.nextLine().charAt(0);

                switch (result) {
                    case 'W':
                        points += 3;
                        won++;
                        break;
                    case 'D':
                        points += 1;
                        draw++;
                        break;
                    case 'L':
                        defeat++;
                        break;
                }
            }
            System.out.printf("%s has won %d points during this season.%n", teamName, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", won);
            System.out.printf("## D: %d%n", draw);
            System.out.printf("## L: %d%n", defeat);
            System.out.printf("Win rate: %.2f%%", 1.0 * won / matchesCount * 100);
        }
    }
}
