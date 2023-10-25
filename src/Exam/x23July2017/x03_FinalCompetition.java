package Exam.x23July2017;

import java.util.Scanner;

public class x03_FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDancers = Integer.parseInt(scanner.nextLine());
        double score = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double profit = 0.0;
        double expenses = 0.0;

        if ("Bulgaria".equalsIgnoreCase(place)) {
            profit = score * countDancers;
            if ("Summer".equalsIgnoreCase(season)) {
                expenses = profit - (profit * 0.05);
            } else {
                expenses = profit - (profit * 0.08);
            }
        } else {
            profit = ((score * countDancers) + ((score * countDancers) * 0.50));
            if ("Summer".equalsIgnoreCase(season)) {
                expenses = profit - (profit * 0.10);
            } else {
                expenses = profit - (profit * 0.15);
            }
        }
        double charity = expenses * 0.75;
        double profitPerDancer = (expenses - charity) / countDancers;
        System.out.printf("Charity - %.2f%nMoney per dancer - %.2f", charity, profitPerDancer);
    }
}
