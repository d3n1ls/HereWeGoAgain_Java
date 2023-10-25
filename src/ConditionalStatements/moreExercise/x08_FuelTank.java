package ConditionalStatements.moreExercise;

import java.util.Scanner;

public class x08_FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        int liters = Integer.parseInt(scanner.nextLine());

        if (fuel.equals("Diesel") || fuel.equals("Gasoline") || fuel.equals("Gas")) {
            if (liters >= 25) {
                System.out.printf("You have enough %s.", fuel.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuel.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
