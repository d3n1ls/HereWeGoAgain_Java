package Exam.x28And29July2018;

import java.util.Scanner;

public class FanShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        int countItems = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = 0; i < countItems; i++) {
            String item = scan.nextLine().toLowerCase(); // hoodie, keychain, T-shirt, flag, sticker
            switch (item) {
                case "hoodie": sum += 30; break;
                case "keychain": sum += 4; break;
                case "t-shirt": sum += 20; break;
                case "flag": sum += 15; break;
                case "sticker": sum += 1; break;
            }
        }

        if (budget >= sum) {
            System.out.printf("You bought %d items and left with %d lv.", countItems, budget - sum);
        } else {
            System.out.printf("Not enough money, you need %d more lv.", sum - budget);
        }
    }
}
