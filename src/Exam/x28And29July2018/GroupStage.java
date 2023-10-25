package Exam.x28And29July2018;

import java.util.Scanner;

public class GroupStage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String team = scan.nextLine();
        int playedMatches = Integer.parseInt(scan.nextLine());

        int goalDifference = 0;
        int points = 0;

        for (int i = 0; i < playedMatches ; i++) {
            int goalsFor = Integer.parseInt(scan.nextLine());
            int goalsAgainst = Integer.parseInt(scan.nextLine());

            if (goalsFor > goalsAgainst) {
                points += 3;
            } else if (goalsFor == goalsAgainst) {
                points += 1;
            }

            goalDifference += goalsFor - goalsAgainst;

        }

        if (goalDifference >= 0) {
            System.out.printf("%s has finished the group phase with %d points.%n", team, points);
            System.out.printf("Goal difference: %d.", goalDifference);
        } else {
            System.out.printf("%s has been eliminated from the group phase.%n", team);
            System.out.printf("Goal difference: %d.", goalDifference);
        }
    }
}
