package ForLoop.exercises;

import java.util.Scanner;

public class x08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int wins = 0;

        for (int i = 0; i < tournaments; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    points += 2000;
                    wins++;//count
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d\n", points + initialPoints);
        System.out.printf("Average points: %d\n", points / tournaments);
        System.out.printf("%.2f%%", wins * 1.0 / tournaments * 100);//1.0 double
    }
}
