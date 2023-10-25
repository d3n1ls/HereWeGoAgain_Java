package Exam.x17December2017;

import java.util.Scanner;

public class x02_NewYearsEveParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGuests = Integer.parseInt(scanner.nextLine());
        int amountMoney = Integer.parseInt(scanner.nextLine());

        int haveMoney = countGuests * 20;

        int diff = Math.abs(amountMoney - haveMoney);

        if (amountMoney >= haveMoney) {
            double fireworksPrice = diff * 0.4;
            double moneyCharity = diff - fireworksPrice;
            System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.", fireworksPrice, moneyCharity);
        } else {
            System.out.printf("They won't have enough money to pay the covert. They will need %d lv more.", diff);
        }
    }
}
