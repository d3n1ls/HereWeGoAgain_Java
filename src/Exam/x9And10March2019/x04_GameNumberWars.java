package Exam.x9And10March2019;

import java.util.Scanner;

public class x04_GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstPlayerName = scanner.nextLine();
        String secondPlayerName = scanner.nextLine();

        int firstPlayerPoints = 0;
        int secondPlayerPoints = 0;
        boolean isNumberWars = false;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End of game")) {
                System.out.printf("%s has %d points%n", firstPlayerName, firstPlayerPoints);
                System.out.printf("%s has %d points", secondPlayerName, secondPlayerPoints);
                break;
            }

            int firstPlayerCard = Integer.parseInt(input);
            int secondPlayerCard = Integer.parseInt(scanner.nextLine());

            if (!isNumberWars) {
                if (firstPlayerCard > secondPlayerCard) {
                    firstPlayerPoints += (firstPlayerCard - secondPlayerCard);
                } else if (secondPlayerCard > firstPlayerCard) {
                    secondPlayerPoints += (secondPlayerCard - firstPlayerCard);
                } else {
                    isNumberWars = true;
                    continue;
                }
            }

            if (isNumberWars) {
                System.out.println("Number wars!");

                if (firstPlayerCard > secondPlayerCard) {
                    System.out.printf("%s is winner with %d points", firstPlayerName, firstPlayerPoints);
                } else {
                    System.out.printf("%s is winner with %d points", secondPlayerName, secondPlayerPoints);
                }
                break;
            }
        }
    }
}
