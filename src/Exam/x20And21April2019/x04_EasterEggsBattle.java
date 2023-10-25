package Exam.x20And21April2019;

import java.util.Scanner;

public class x04_EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int player1 = Integer.parseInt(scanner.nextLine());
        int player2 = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("End of battle")) {
            // Победител - текст - "one" или "two"
            switch (input) {
                case "one":
                    player2--;
                    break;
                case "two":
                    player1--;
                    break;
            }
            if (player2 <= 0) {
                System.out.printf("Player two is out of eggs. " +
                        "Player one has %d eggs left.", player1);
                break;
            }
            if (player1 <= 0) {
                System.out.printf("Player one is out of eggs. " +
                        "Player two has %d eggs left.", player2);
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.\n" +
                    "Player two has %d eggs left.\n", player1, player2);
        }
    }
}
