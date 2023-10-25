package Exam.e23And24October2021;

import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        int kgFoodLeft = Integer.parseInt(scanner.nextLine());
        double firstDeerFoodPerDay = Double.parseDouble(scanner.nextLine());
        double secondDeerFoodPerDay = Double.parseDouble(scanner.nextLine());
        double thirdDeerFoodPerDay = Double.parseDouble(scanner.nextLine());

        double foodNeeded = daysCount * (firstDeerFoodPerDay + secondDeerFoodPerDay + thirdDeerFoodPerDay);

        if (kgFoodLeft >= foodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(kgFoodLeft - foodNeeded));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNeeded - kgFoodLeft));
        }
    }
}
