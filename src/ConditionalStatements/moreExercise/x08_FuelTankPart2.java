package ConditionalStatements.moreExercise;

import java.util.Scanner;

public class x08_FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double amountOfFuel = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        if (card.equals("Yes")) {
            if (amountOfFuel > 25) {
                if (fuel.equals("Gas")) {
                    double gas = (amountOfFuel * (0.93 - 0.08)) - (amountOfFuel * (0.93 - 0.08)) * 0.10;
                    System.out.printf("%.2f lv.", gas);
                } else if (fuel.equals("Gasoline")) {
                    double gasoline = (amountOfFuel * (2.22 - 0.18)) - (amountOfFuel * (2.22 - 0.18)) * 0.10;
                    System.out.printf("%.2f lv.", gasoline);
                } else if (fuel.equals("Diesel")) {
                    double diesel = (amountOfFuel * (2.33 - 0.12)) - (amountOfFuel * (2.33 - 0.12)) * 0.10;
                    System.out.printf("%.2f lv.", diesel);
                }
            } else if (amountOfFuel >= 20 && amountOfFuel <= 25) {
                if (fuel.equals("Gas")) {
                    double gas = (amountOfFuel * (0.93 - 0.08)) - (amountOfFuel * (0.93 - 0.08)) * 0.08;
                    System.out.printf("%.2f lv.", gas);
                } else if (fuel.equals("Gasoline")) {
                    double gasoline = (amountOfFuel * (2.22 - 0.18)) - (amountOfFuel * (2.22 - 0.18)) * 0.08;
                    System.out.printf("%.2f lv.", gasoline);
                } else if (fuel.equals("Diesel")) {
                    double diesel = (amountOfFuel * (2.33 - 0.12)) - (amountOfFuel * (2.33 - 0.12)) * 0.08;
                    System.out.printf("%.2f lv.", diesel);
                }
            } else {
                if (fuel.equals("Gas")) {
                    double gas = (amountOfFuel * (0.93 - 0.08));
                    System.out.printf("%.2f lv.", gas);
                } else if (fuel.equals("Gasoline")) {
                    double gasoline = (amountOfFuel * (2.22 - 0.18));
                    System.out.printf("%.2f lv.", gasoline);
                } else if (fuel.equals("Diesel")) {
                    double diesel = (amountOfFuel * (2.33 - 0.12));
                    System.out.printf("%.2f lv.", diesel);
                }
            }
        } else {
            if (amountOfFuel > 25) {
                if (fuel.equals("Gas")) {
                    double gas = (amountOfFuel * 0.93) - (amountOfFuel * 0.93) * 0.10;
                    System.out.printf("%.2f lv.", gas);
                } else if (fuel.equals("Gasoline")) {
                    double gasoline = (amountOfFuel * 2.22) - (amountOfFuel * 2.22) * 0.10;
                    System.out.printf("%.2f lv.", gasoline);
                } else if (fuel.equals("Diesel")) {
                    double diesel = (amountOfFuel * 2.33) - (amountOfFuel * 2.33) * 0.10;
                    System.out.printf("%.2f lv.", diesel);
                }
            } else if (amountOfFuel >= 20 && amountOfFuel <= 25) {
                if (fuel.equals("Gas")) {
                    double gas = (amountOfFuel * 0.93) - (amountOfFuel * 0.93) * 0.08;
                    System.out.printf("%.2f lv.", gas);
                } else if (fuel.equals("Gasoline")) {
                    double gasoline = (amountOfFuel * 2.22) - (amountOfFuel * 2.22) * 0.08;
                    System.out.printf("%.2f lv.", gasoline);
                } else if (fuel.equals("Diesel")) {
                    double diesel = (amountOfFuel * 2.33) - (amountOfFuel * 2.33) * 0.08;
                    System.out.printf("%.2f lv.", diesel);
                }
            } else {
                if (fuel.equals("Gas")) {
                    double gas = amountOfFuel * 0.93;
                    System.out.printf("%.2f lv.", gas);
                } else if (fuel.equals("Gasoline")) {
                    double gasoline = amountOfFuel * 2.22;
                    System.out.printf("%.2f lv.", gasoline);
                } else if (fuel.equals("Diesel")) {
                    double diesel = amountOfFuel * 2.33;
                    System.out.printf("%.2f lv.", diesel);
                }
            }
        }
    }
}
