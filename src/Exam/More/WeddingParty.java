package Exam.More;

import java.util.Scanner;

public class WeddingParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guestsCount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        int priceCouvert = guestsCount * 20;

        if (priceCouvert <= budget) {
            double leftMoney = budget - priceCouvert;
            double fireworks = leftMoney * 0.4;
            double charity = leftMoney - fireworks;
            System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.", fireworks, charity);
        } else {
            System.out.printf("They won't have enough money to pay the covert. They will need %d lv more.", priceCouvert - budget);
        }
    }
}
