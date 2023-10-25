package Exam.x16December2017;

import java.util.Scanner;

public class x02_DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tripSanta = Integer.parseInt(scanner.nextLine());
        int haveFoodKg = Integer.parseInt(scanner.nextLine());
        double firstDeerFoodDaily = Double.parseDouble(scanner.nextLine());
        double secondDeerFoodDaily = Double.parseDouble(scanner.nextLine());
        double thirdDeerFoodDaily = Double.parseDouble(scanner.nextLine());

        double needFoodFirst = firstDeerFoodDaily * tripSanta;
        double needFoodSecond = secondDeerFoodDaily * tripSanta;
        double needFoodThird = thirdDeerFoodDaily * tripSanta;

        double foodAllDeers = needFoodFirst + needFoodSecond + needFoodThird;

        double diff = Math.abs(foodAllDeers - haveFoodKg);
        if (foodAllDeers <= haveFoodKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }
    }
}
