package ConditionalStatements.exercise;

import java.util.Scanner;

public class x07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double videoCardsTotalPrice = 250 * videoCards;
        double processorPrice = videoCardsTotalPrice * 0.35;
        double ramPrice = videoCardsTotalPrice * 0.10;
        double totalPrice = videoCardsTotalPrice + processors * processorPrice + ram * ramPrice;
        if (videoCards > processors) {
            totalPrice = totalPrice - totalPrice * 0.15;
        }

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }
    }
}
