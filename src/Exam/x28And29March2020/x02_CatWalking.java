package Exam.x28And29March2020;

import java.util.Scanner;

public class x02_CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int walkDuration = Integer.parseInt(scanner.nextLine());
        int walksCount = Integer.parseInt(scanner.nextLine());
        int caloriesEaten = Integer.parseInt(scanner.nextLine());

        int caloriesBurned = walkDuration * walksCount * 5;

        if (caloriesBurned >= caloriesEaten / 2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesBurned);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesBurned);
        }
    }
}
