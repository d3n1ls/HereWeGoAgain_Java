package Exam.x2And3May2019;

import java.util.Scanner;

public class x04_TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        //повтаряме: четем команда (продукт или Stop)
        //стоп: команда == "Stop"
        //продължаваме: команда != "Stop"
        int countProducts = 0; //брой на продуктите
        double totalSum = 0; // обща сума за продуктите
        String command = scanner.nextLine(); //продукт или "Stop"
        while (!command.equals("Stop")) {
            //продукт
            double price = Double.parseDouble(scanner.nextLine());
            countProducts++;
            //цената да е на 100%
            //цената да е на 50%
            if (countProducts % 3 == 0) {
                price = price / 2;
            }
            totalSum += price;
            //проверка дали сме надминали бюджетът
            if (totalSum > budget) {
                System.out.println("You don't have enough money!");
                double needMoney = totalSum - budget;
                System.out.printf("You need %.2f leva!", needMoney);
                break;
            }
            command = scanner.nextLine();
        }

        if (command.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", countProducts, totalSum);
        }
    }
}
