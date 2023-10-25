package Exam.x28And29March2020;

import java.util.Scanner;

public class x04_FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        double totalDog = 0;
        double totalCat = 0;
        double totalEaten = 0;
        double biscuits = 0;

        for (int d = 0; d < daysCount; d++) {
            int consumedByDog = Integer.parseInt(scanner.nextLine());
            int consumedByCat = Integer.parseInt(scanner.nextLine());

            totalEaten += (consumedByCat + consumedByDog);
            totalDog += consumedByDog;
            totalCat += consumedByCat;

            if ((d + 1) % 3 == 0) {
                biscuits += (consumedByCat + consumedByDog) * 0.1;
            }
        }
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", totalEaten / totalFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", totalDog / totalEaten * 100);
        System.out.printf("%.2f%% eaten from the cat.", totalCat / totalEaten * 100);
    }
}
