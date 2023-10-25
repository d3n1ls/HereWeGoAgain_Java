package Exam.x28And29March2020;

import java.util.Scanner;

public class x06_TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());

        double totalMoneyEarned = 0;
        int daysWon = 0;

        for (int i = 0; i < daysCount; i++) {
            double moneyEarnedThisDay = 0;
            int wonGames = 0;
            int lostGames = 0;

            while (true) {
                String sport = scanner.nextLine();

                if (sport.equals("Finish")) {
                    break;
                }
                String result = scanner.nextLine();

                if (result.equals("win")) {
                    moneyEarnedThisDay += 20;
                    wonGames++;
                } else {
                    lostGames++;
                }
            }
            if (wonGames > lostGames) {
                moneyEarnedThisDay *= 1.1;
                daysWon++;
            }
            totalMoneyEarned += moneyEarnedThisDay;
        }
        if (daysWon > daysCount - daysWon) {
            totalMoneyEarned *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoneyEarned);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoneyEarned);
        }
    }
}
