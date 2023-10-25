package Exam.x28And29July2018;

import java.util.Scanner;

public class GameInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String team = scan.nextLine();
        int matches = Integer.parseInt(scan.nextLine());

        int totalMinutes = 0;
        double averageMinutes = 0;

        int matchesWithExtraTime = 0;
        int matchesWithPenalties = 0;

        for (int i = 0; i < matches; i++) {
            int matchDuration = Integer.parseInt(scan.nextLine());

            totalMinutes += matchDuration;
            averageMinutes = totalMinutes / (matches * 1.0);

            if (matchDuration > 90 && matchDuration <= 120) {
                matchesWithExtraTime++;
            } else if (matchDuration >= 120) {
                matchesWithPenalties++;
            }
        }

        System.out.printf("%s has played %d minutes. Average minutes per game: %.2f%n", team, totalMinutes, averageMinutes);
        System.out.printf("Games with penalties: %d%n", matchesWithPenalties);
        System.out.printf("Games with additional time: %d%n", matchesWithExtraTime);
    }
}
