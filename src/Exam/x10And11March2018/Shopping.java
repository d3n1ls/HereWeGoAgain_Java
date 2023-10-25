package Exam.x10And11March2018;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double chocolates = Double.parseDouble(scanner.nextLine());
        double litersOfMilk = Double.parseDouble(scanner.nextLine());

        double moneyForChockos = chocolates * 0.65;
        double moneyForMilk = litersOfMilk * 2.70;

        double mandariniCount = Math.floor(chocolates - (chocolates * 0.35));
        double moneyForMandarini = mandariniCount * 0.20;

        double totalSpendMony = moneyForChockos + moneyForMilk + moneyForMandarini;

        if (totalSpendMony > budget) {
            System.out.printf("Not enough money, you need %.2f more!", totalSpendMony - budget);
        } else {
            System.out.printf("You got this, %.2f money left!", budget - totalSpendMony);
        }
    }
}
