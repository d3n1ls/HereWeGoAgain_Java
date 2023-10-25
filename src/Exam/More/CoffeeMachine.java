package Exam.More;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //•	Първи ред - напитка - текст с възможности"Espresso", "Cappuccino" или "Tea"
        //•	Втори ред - захар - текст  с възможности "Without", "Normal" или "Extra"
        //•	Трети ред - брой напитки - цяло число в интервала [1… 50]
        String beverage = scan.nextLine();
        String sugarType = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        double price = 0;

        if (sugarType.equals("Without")) {
            switch (beverage) {
                case "Espresso":
                    price = 0.90;
                    break;
                case "Cappuccino":
                    price = 1.00;
                    break;
                case "Tea":
                    price = 0.50;
                    break;
            }
        } else if (sugarType.equals("Normal")) {
            switch (beverage) {
                case "Espresso":
                    price = 1;
                    break;
                case "Cappuccino":
                    price = 1.20;
                    break;
                case "Tea":
                    price = 0.60;
                    break;
            }
        } else if (sugarType.equals("Extra")) {
            switch (beverage) {
                case "Espresso":
                    price = 1.20;
                    break;
                case "Cappuccino":
                    price = 1.60;
                    break;
                case "Tea":
                    price = 0.70;
                    break;
            }
        }
        double total = price * count;
        if (sugarType.equals("Without")) {
            total = total - 0.35 * total;
        }
        if (beverage.equals("Espresso") && count >= 5) {
            total = total - 0.25 * total;
        }
        if (total > 15) {
            total = total - 0.20 * total;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", count, beverage, total);
    }
}
