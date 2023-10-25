package ConditionalStatements.moreExercise;

import java.util.Scanner;

public class x06_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double dayDogFood = Double.parseDouble(scanner.nextLine());
        double dayCatFood = Double.parseDouble(scanner.nextLine());
        double dayTurtleFood = Double.parseDouble(scanner.nextLine());

        double neededDogFood = days * dayDogFood;
        double neededCatFood = days * dayCatFood;
        double neededTurtleFood = days * dayTurtleFood / 1000;
        double totalFood = neededDogFood + neededCatFood + neededTurtleFood;
        double margin = Math.abs(leftFood - totalFood);
        if (leftFood >= totalFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(margin));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(margin));
        }
    }
}
