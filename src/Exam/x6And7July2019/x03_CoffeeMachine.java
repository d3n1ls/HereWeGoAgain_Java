package Exam.x6And7July2019;

import java.util.Scanner;

public class x03_CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String drinkAdditions = scanner.nextLine();
        int drinksCount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (drink) {
            case "Espresso":
                switch (drinkAdditions) {
                    case "Without":
                        price = 0.9;
                        break;
                    case "Normal":
                        price = 1;
                        break;
                    case "Extra":
                        price = 1.2;
                        break;
                }
                break;
            case "Cappuccino":
                switch (drinkAdditions) {
                    case "Without":
                        price = 1;
                        break;
                    case "Normal":
                        price = 1.2;
                        break;
                    case "Extra":
                        price = 1.6;
                        break;
                }
                break;
            case "Tea":
                switch (drinkAdditions) {
                    case "Without":
                        price = 0.5;
                        break;
                    case "Normal":
                        price = 0.6;
                        break;
                    case "Extra":
                        price = 0.7;
                        break;
                }
                break;
        }
        if (drinkAdditions.equals("Without")) {
            price *= 0.65;
        }
        if (drink.equals("Espresso") && drinksCount >= 5) {
            price *= 0.75;
        }
        price *= drinksCount;

        if (price > 15) {
            price *= 0.8;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", drinksCount, drink, price);
    }
}
