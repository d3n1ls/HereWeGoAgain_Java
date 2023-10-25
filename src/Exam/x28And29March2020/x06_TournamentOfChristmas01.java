package Exam.x28And29March2020;

import java.util.Scanner;

public class x06_TournamentOfChristmas01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        double money = 0;
        int countWin = 0;

        for (int i = 1; i <= days; i++) {
            int win = 0;
            int lose = 0;
            double moneyDay = 0;
            while (true) {
                String sport = scan.nextLine();
                if (sport.equals("Finish")) {
                    break;
                }
                String play = scan.nextLine();
                if (play.equals("win")) {
                    win++;
                    moneyDay += 20;
                } else if (play.equals("lose")) {
                    lose++;
                }
            }
            if (win > lose) {
                moneyDay *= (1 + 0.1);
                countWin++;
            }
            money += moneyDay;
        }
        if (countWin > (days / 2)) {
            money *= (1 + 0.2);
            System.out.printf("You won the tournament! Total raised money: %.2f", money);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", money);
        }
        scan.close();
    }
}
