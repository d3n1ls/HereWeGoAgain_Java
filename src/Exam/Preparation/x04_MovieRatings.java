package Exam.Preparation;

import java.util.Scanner;

public class x04_MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMovies = Integer.parseInt(scanner.nextLine());

        String movieNameMaxRating = ""; //филма с максимален рейтинг
        double maxRating = Double.MIN_VALUE; //максимален рейтинг

        String movieNameMinRating = ""; //филма с минимален рейтинг
        double minRating = Double.MAX_VALUE; //минималния рейтинг

        double sumRating = 0; //сума на всички рейтинги
        for (int movie = 1; movie <= countMovies; movie++) {
            String movieName = scanner.nextLine();
            double movieRating = Double.parseDouble(scanner.nextLine());
            sumRating += movieRating;
            //проверка дали този рейтинг е макс
            if (movieRating > maxRating) {
                maxRating = movieRating;
                movieNameMaxRating = movieName;
            }
            //проверка дали този рейтинг е мин
            if (movieRating < minRating) {
                minRating = movieRating;
                movieNameMinRating = movieName;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", movieNameMaxRating, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", movieNameMinRating, minRating);
        //средно аритметично = сума от всички рейтинги / бр. рейтинги (бр. филми)
        double averageRating = sumRating / countMovies;
        System.out.printf("Average rating: %.1f", averageRating);
    }
}
