package Exam.x20November2016;

import java.util.Scanner;

public class x02_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        int haveFoodKg = Integer.parseInt(scanner.nextLine());
        double foodDayDogKg = Double.parseDouble(scanner.nextLine());
        double foodDayCatKg = Double.parseDouble(scanner.nextLine());
        double foodDayTurtleGr = Double.parseDouble(scanner.nextLine());

        double needFoodKg = (foodDayDogKg * countDays) +
                (foodDayCatKg * countDays) +
                (foodDayTurtleGr * countDays / 1000);

        double left = 0.0;
        double need = 0.0;

        if (needFoodKg <= haveFoodKg) {
            left = haveFoodKg - needFoodKg;
            System.out.printf("%.0f kilos of food left.", Math.floor(left));
        } else {
            need = needFoodKg - haveFoodKg;
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(need));
        }
    }
}
