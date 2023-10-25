package Exam.x15And16June2019;

import java.util.Scanner;

public class x06_FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moviesCount = 0;
        int maxPoints = Integer.MIN_VALUE;
        String bestMovie = "";

        while (true) {
            String movieName = scanner.nextLine();

            if (movieName.equals("STOP")) {
                break;
            }

            moviesCount++;
            int moviePoints = 0;
            int smallLettersCount = 0;
            int capitalLettersCount = 0;

            for (int i = 0; i < movieName.length(); i++) {
                char symbol = movieName.charAt(i);

                moviePoints += movieName.charAt(i);

                if (Character.isLowerCase(symbol)) {
                    moviePoints -= (2 * movieName.length());
                } else if (Character.isUpperCase(symbol)) {
                    moviePoints -= movieName.length();
                }
            }

            if (moviePoints > maxPoints) {
                maxPoints = moviePoints;
                bestMovie = movieName;
            }

            if (moviesCount == 7) {
                System.out.println("The limit is reached.");
                break;
            }
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxPoints);
    }
}
