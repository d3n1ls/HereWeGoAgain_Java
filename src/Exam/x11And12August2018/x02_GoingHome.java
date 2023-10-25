package Exam.x11And12August2018;

import java.util.Scanner;

public class x02_GoingHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int distance = Integer.parseInt(scan.nextLine());
        int gasolineConsuption = Integer.parseInt(scan.nextLine());
        double gasolinePrice = Double.parseDouble(scan.nextLine());
        int moneyPrize = Integer.parseInt(scan.nextLine());

        double carConsuption = (distance * gasolineConsuption) / 100.0;
        double totalConsuption = carConsuption * gasolinePrice;
        double moneyLeft = moneyPrize - totalConsuption;

        if (moneyPrize >= totalConsuption) {
            System.out.printf("You can go home. %.2f money left.", moneyLeft);
        } else {
            System.out.printf("Sorry, you cannot go home. Each will receive %.2f money.", moneyPrize / 5.0);
        }
    }
}
