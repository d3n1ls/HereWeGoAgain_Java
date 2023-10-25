package Exam.x6And7July2019;

import java.util.Scanner;

public class x06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoints = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (true) {
            String playerName = scanner.nextLine();

            if (playerName.equals("Stop")) {
                break;
            }
            int playerPoints = 0;

            for (int i = 0; i < playerName.length(); i++) {
                int number = Integer.parseInt(scanner.nextLine());

                if (number == playerName.charAt(i)) {
                    playerPoints += 10;
                } else {
                    playerPoints += 2;
                }
            }
            if (playerPoints >= maxPoints) {
                maxPoints = playerPoints;
                bestPlayer = playerName;
            }
        }
        System.out.printf("The winner is %s with %d points!", bestPlayer, maxPoints);
    }
}
