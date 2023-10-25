package Exam.x9And10March2019;

import java.util.Scanner;

public class x04_Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        // Първоначално играчът започва с 301 точки
        int initialPoints = 301;
        boolean isWon = false;
        int successfulShots = 0;
        int unSuccessfulShots = 0;

        String command = scanner.nextLine();

        while (!command.equals("Retire")) {
            int points = Integer.parseInt(scanner.nextLine());
            // ("Single", "Double" или "Triple")
            switch (command) {
                case "Double":
                    points *= 2;
                    break;
                case "Triple":
                    points *= 3;
                    break;
            }
            // : При налични точки 100, удар даващ повече от 100 точки, неуспешен
            //При налични точки 100, удар даващ по-малко или равни на 100 точки, успешен
            if (points <= initialPoints) {
                initialPoints -= points;
                successfulShots++;
                if (initialPoints == 0) {
                    isWon = true;
                    break;
                }
            } else {
                unSuccessfulShots++;
            }

            command = scanner.nextLine();
        }
        if (isWon) {
            System.out.printf("%s won the leg with %d shots.", player, successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", player, unSuccessfulShots);
        }
    }
}
