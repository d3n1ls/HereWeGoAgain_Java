package Exam.More;

import java.util.Scanner;

public class FanStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String subject = scanner.nextLine();

            if (subject.equalsIgnoreCase("hoodie")) {
                sum += 30;
            } else if (subject.equalsIgnoreCase("keychain")) {
                sum += 4;
            } else if (subject.equalsIgnoreCase("T-shirt")) {
                sum += 20;
            } else if (subject.equalsIgnoreCase("flag")) {
                sum += 15;
            } else if (subject.equalsIgnoreCase("sticker")) {
                sum += 1;
            }
        }
        if (budget >= sum) {
            System.out.printf("You bought %d items and left with %d lv.", n, budget - sum);
        } else {
            System.out.printf("Not enough money, you need %d more lv.", Math.abs(sum - budget));
        }
    }
}
