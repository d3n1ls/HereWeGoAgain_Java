package Exam.x18And19July2020;

import java.util.Scanner;

public class x05_BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        // кой е играчът с най-много голове
        String bestPlayer = "";
        int maxGoals = Integer.MIN_VALUE;
        // дали е направил хет-трик
        boolean isHatTrick = false;
        while (!player.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > maxGoals) {
                maxGoals = goals;
                bestPlayer = player;
            }
            if (goals >= 3) {
                isHatTrick = true;
            }
            if (goals >= 10) {
                break;
            }
            player = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);

        if (isHatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
