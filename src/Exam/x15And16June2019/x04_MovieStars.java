package Exam.x15And16June2019;

import java.util.Scanner;

public class x04_MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        while (true) {
            String actorName = scanner.nextLine();

            if (actorName.equals("ACTION")) {
                System.out.printf("We are left with %.2f leva.",
                        budget);
                break;
            }

            double salary = 0;

            if (actorName.length() <= 15) {
                salary = Double.parseDouble(scanner.nextLine());
            } else {
                salary = budget * 0.2;
            }

            budget -= salary;

            if (budget < 0) {
                System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
                break;
            }
        }
    }
}
