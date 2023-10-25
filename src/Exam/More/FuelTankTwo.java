package Exam.More;

import java.util.Scanner;

public class FuelTankTwo {
    public static void main(String[] args) {
        //Типа на горивото – текст с възможности: "Gas", "Gasoline" или "Diesel"
        //Количество гориво – реално число в интервала [1.00 … 50.00]
        //Притежание на клубна карта – текст с възможности: "Yes" или "No"
        Scanner scan = new Scanner(System.in);
        String fuelType = scan.nextLine();
        double fuelLiters = Double.parseDouble(scan.nextLine());
        String discountCard = scan.nextLine();
        double gasoline = 2.22;
        double diesel = 2.33;
        double gas = 0.93;
        if (fuelType.equals("Gas")) {
            if (discountCard.equals("Yes")) {
                gas = gas - 0.08;
            }
            if (fuelLiters >= 20 && fuelLiters <= 25) {
                double fuel = gas * fuelLiters;
                double discount = 0.08 * fuel;
                double total = fuel - discount;
                System.out.printf("%.2f lv.", total);
            } else if (fuelLiters > 25) {
                double fuel = gas * fuelLiters;
                double discount = 0.10 * fuel;
                double total = fuel - discount;
                System.out.printf("%.2f lv.", total);
            } else if (fuelLiters < 20) {
                double fuel = gas * fuelLiters;
                System.out.printf("%.2f lv.", fuel);
            }
        }
        if (fuelType.equals("Gasoline")) {
            if (discountCard.equals("Yes")) {
                gasoline = gasoline - 0.18;
            }
            if (fuelLiters >= 20 && fuelLiters <= 25) {
                double fuel = gasoline * fuelLiters;
                double discount = 0.08 * fuel;
                double total = fuel - discount;
                System.out.printf("%.2f lv.", total);
            } else if (fuelLiters > 25) {
                double fuel = gasoline * fuelLiters;
                double discount = 0.10 * fuel;
                double total = fuel - discount;
                System.out.printf("%.2f lv.", total);
            } else if (fuelLiters < 20) {
                double fuel = gasoline * fuelLiters;
                System.out.printf("%.2f lv.", fuel);
            }
        }
        if (fuelType.equals("Diesel")) {
            if (discountCard.equals("Yes")) {
                diesel = diesel - 0.12;
            }
            if (fuelLiters >= 20 && fuelLiters <= 25) {
                double fuel = diesel * fuelLiters;
                double discount = 0.08 * fuel;
                double total = fuel - discount;
                System.out.printf("%.2f lv.", total);
            } else if (fuelLiters > 25) {
                double fuel = diesel * fuelLiters;
                double discount = 0.10 * fuel;
                double total = fuel - discount;
                System.out.printf("%.2f lv.", total);
            } else if (fuelLiters < 20) {
                double fuel = diesel * fuelLiters;
                System.out.printf("%.2f lv.", fuel);
            }
        }
    }
}
