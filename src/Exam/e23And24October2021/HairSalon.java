package Exam.e23And24October2021;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moneyTarget = Integer.parseInt(scanner.nextLine());

        int moneyEarned = 0;

        while (true) {
            String service = scanner.nextLine();

            if (service.equals("closed")) {
                System.out.printf("Target not reached! You need %dlv. more.%n", moneyTarget - moneyEarned);
                break;
            }

            switch (service) {
                case "haircut":
                    String type = scanner.nextLine();

                    switch (type) {
                        case "mens":
                            moneyEarned += 15;
                            break;
                        case "ladies":
                            moneyEarned += 20;
                            break;
                        case "kids":
                            moneyEarned += 10;
                            break;
                    }
                    break;
                case "color":
                    type = scanner.nextLine();

                    switch (type) {
                        case "touch up":
                            moneyEarned += 20;
                            break;
                        case "full color":
                            moneyEarned += 30;
                            break;
                    }
                    break;
            }

            if (moneyEarned >= moneyTarget) {
                System.out.println("You have reached your target for the day!");
                break;
            }
        }

        System.out.printf("Earned money: %dlv.", moneyEarned);
    }
}
