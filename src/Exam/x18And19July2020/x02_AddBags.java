package Exam.x18And19July2020;

import java.util.Scanner;

public class x02_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double luggageTax = Double.parseDouble(scanner.nextLine());
        double luggageWeight = Double.parseDouble(scanner.nextLine());
        int daysCount = Integer.parseInt(scanner.nextLine());
        int luggageCount = Integer.parseInt(scanner.nextLine());

        if (luggageWeight < 10) {
            luggageTax *= 0.2;
        } else if (luggageWeight <= 20) {
            luggageTax *= 0.5;
        }

        if (daysCount > 30) {
            luggageTax *= 1.1;
        } else if (daysCount >= 7) {
            luggageTax *= 1.15;
        } else {
            luggageTax *= 1.4;
        }
        double totalPrice = luggageTax * luggageCount;

        System.out.printf("The total price of bags is: %.2f lv.",
                totalPrice);
    }
}
