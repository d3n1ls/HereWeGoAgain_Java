package NestedLoops.lab;

import java.util.Scanner;

public class x05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine(); //дестинация или "End"
        //повтарям: чета дестинация + чета сума
        //спирам: дестинация == "Еnd"
        //продължавам: дестинация != "Еnd"
        while (!destination.equals("End")) {
            //дестинация
            double needBudget = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;
            //повтаряме: събира пари
            //спира: събраните пари >= needBudget
            //продължава: събраните пари < needBudget
            while (savedMoney < needBudget) {
                double money = Double.parseDouble(scanner.nextLine());
                savedMoney += money;
            }
            System.out.println("Going to " + destination + "!");

            destination = scanner.nextLine();
        }
    }
}
