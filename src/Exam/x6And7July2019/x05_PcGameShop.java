package Exam.x6And7July2019;

import java.util.Scanner;

public class x05_PcGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesCount = Integer.parseInt(scanner.nextLine());

        int hearthstone = 0;
        int fortnite = 0;
        int overwatch = 0;
        int others = 0;

        for (int i = 0; i < gamesCount; i++) {
            String gameName = scanner.nextLine();

            switch (gameName) {
                case "Hearthstone":
                    hearthstone++;
                    break;
                case "Fornite":
                    fortnite++;
                    break;
                case "Overwatch":
                    overwatch++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", 1.0 * hearthstone / gamesCount * 100);
        System.out.printf("Fornite - %.2f%%%n", 1.0 * fortnite / gamesCount * 100);
        System.out.printf("Overwatch - %.2f%%%n", 1.0 * overwatch / gamesCount * 100);
        System.out.printf("Others - %.2f%%%n", 1.0 * others / gamesCount * 100);
    }
}
