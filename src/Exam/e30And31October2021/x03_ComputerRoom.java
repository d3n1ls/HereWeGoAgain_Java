package Exam.e30And31October2021;

import java.util.Scanner;

public class x03_ComputerRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine().toLowerCase();
        int spentHours = Integer.parseInt(scan.nextLine());
        int peoplesInGroup = Integer.parseInt(scan.nextLine());
        String timeOfDay = scan.nextLine().toLowerCase();

        double price = 0.0;

        switch (month) {
            case "march":
            case "april":
            case "may":
                if (timeOfDay.equals("day")) {
                    price = 10.50;
                } else {
                    price = 8.4;
                }
                break;
            case "june":
            case "july":
            case "august":
                if (timeOfDay.equals("day")) {
                    price = 12.60;
                } else {
                    price = 10.20;
                }
        }
        if (peoplesInGroup >= 4) {
            price -= (price * 0.1);
        }
        if (spentHours >= 5) {
            price -= (price * 0.5);
        }
        double totalCost = price * spentHours * peoplesInGroup;

        System.out.printf("Price per person for one hour: %.2f%n", price);
        System.out.printf("Total cost of the visit: %.2f", totalCost);
    }
}
