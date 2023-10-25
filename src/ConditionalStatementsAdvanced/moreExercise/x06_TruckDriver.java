package ConditionalStatementsAdvanced.moreExercise;

import java.util.Scanner;

public class x06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double distance = Double.parseDouble(scanner.nextLine());

        double salary = 0.0;

        if (distance <= 5000) {
            if (season.equals("Summer")) {
                salary = distance * 0.90;
            } else if (season.equals("Winter")) {
                salary = distance * 1.05;
            } else {
                salary = distance * 0.75;
            }
        } else if (distance <= 10000) {
            if (season.equals("Summer")) {
                salary = distance * 1.10;
            } else if (season.equals("Winter")) {
                salary = distance * 1.25;
            } else {
                salary = distance * 0.95;
            }
        } else if (distance <= 20000) {
            salary = distance * 1.45;
        }
        double totalSalary = salary * 4 * 0.90;
        System.out.printf("%.2f", totalSalary);
    }
}
