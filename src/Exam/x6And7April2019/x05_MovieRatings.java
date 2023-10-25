package Exam.x6And7April2019;

import java.util.Scanner;

public class x05_MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moviesCount = Integer.parseInt(scanner.nextLine());

        double highestRating = Double.MIN_VALUE;
        String highestRatedMovie = "";
        double lowestRating = Double.MAX_VALUE;
        String lowestRatedMovie = "";
        double averageRating = 0;

        for (int i = 0; i < moviesCount; i++) {
            String movieName = scanner.nextLine();
            double movieRating = Double.parseDouble(scanner.nextLine());

            averageRating += movieRating;

            if (movieRating > highestRating) {
                highestRating = movieRating;
                highestRatedMovie = movieName;
            }
            if (movieRating < lowestRating) {
                lowestRating = movieRating;
                lowestRatedMovie = movieName;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", highestRatedMovie, highestRating);
        System.out.printf("%s is with lowest rating: %.1f%n", lowestRatedMovie, lowestRating);
        System.out.printf("Average rating: %.1f", averageRating / moviesCount);
    }
}
