package ForLoop.мoreExercises;

import java.util.Scanner;

public class x05_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gameTurns = Integer.parseInt(scanner.nextLine());

        double points = 0;
        int from0To9 = 0;
        int from10To19 = 0;
        int from20To29 = 0;
        int from30To39 = 0;
        int from40To50 = 0;
        int invalid = 0;

        for (int i = 0; i < gameTurns; i++) {
            int turnNumber = Integer.parseInt(scanner.nextLine());

            if (turnNumber < 0 || turnNumber > 50) {
                points /= 2;
                invalid++;
            } else if (turnNumber <= 9) {
                points += turnNumber * 0.2;
                from0To9++;
            } else if (turnNumber <= 19) {
                points += turnNumber * 0.3;
                from10To19++;
            } else if (turnNumber <= 29) {
                points += turnNumber * 0.4;
                from20To29++;
            } else if (turnNumber <= 39) {
                points += 50;
                from30To39++;
            } else {
                points += 100;
                from40To50++;
            }
        }
        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", from0To9 * 1.0 / gameTurns * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", from10To19 * 1.0 / gameTurns * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", from20To29 * 1.0 / gameTurns * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", from30To39 * 1.0 / gameTurns * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", from40To50 * 1.0 / gameTurns * 100);
        System.out.printf("Invalid numbers: %.2f%%", invalid * 1.0 / gameTurns * 100);
    }
}
