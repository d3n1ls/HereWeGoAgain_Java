package ConditionalStatementsAdvanced.moreExercise;

import java.util.Scanner;

public class x01_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleNumber = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0.0;
        double transportPrice = 0.0;
        double leftMoney = 0.0;
        double marge = 0.0;
        double neededMoney = 0.0;

        if (peopleNumber >= 50) {
            transportPrice = budget * 0.25;
        } else if (peopleNumber >= 25) {
            transportPrice = budget * 0.40;
        } else if (peopleNumber >= 10) {
            transportPrice = budget * 0.50;
        } else if (peopleNumber >= 5) {
            transportPrice = budget * 0.60;
        } else if (peopleNumber >= 1) {
            transportPrice = budget * 0.75;
        }
        if (category.equals("VIP")) {
            leftMoney = budget - transportPrice;
            neededMoney = 499.99 * peopleNumber;

        } else {
            leftMoney = budget - transportPrice;
            neededMoney = 249.99 * peopleNumber;
        }

        marge = Math.abs(leftMoney - neededMoney);

        if (leftMoney >= neededMoney) {
            System.out.printf("Yes! You have %.2f leva left.", marge);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", marge);
        }
    }
}
