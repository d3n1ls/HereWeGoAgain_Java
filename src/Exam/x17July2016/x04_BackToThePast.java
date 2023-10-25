package Exam.x17July2016;

import java.util.Scanner;

public class x04_BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int yearLive = Integer.parseInt(scanner.nextLine());
        double yearsOld = 18;

        for (int i = 1800; i <= yearLive; i++) {
            if (i % 2 == 0) {
                money -= 12000;
            } else {
                money -= (12000 + (50 * yearsOld));
            }
            yearsOld++;
        }
        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
