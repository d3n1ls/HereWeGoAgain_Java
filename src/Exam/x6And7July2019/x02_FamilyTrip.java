package Exam.x6And7July2019;

import java.util.Scanner;

public class x02_FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        //проверка за нощувките: нощувки > 7 -> цената за 1 нощувка - 5%
        //сума за нощувките = бр. нощувки * цена за 1 нощувка
        //сума за допълнителни разходи = процент * бюджета
        //разходи = сума за нощувки + допълнителни разходи
        //проверка дали бюджетът е достатъчен

        if (nights > 7) {
            pricePerNight = pricePerNight - 0.05 * pricePerNight; //0.95 * pricePerNight
        }
        double sumNights = nights * pricePerNight; //сума за нощувките
        double sumExtra = (percent * 0.01) * budget; //сума за доп. разходи
        double expenses = sumNights + sumExtra;

        //бюджетът да е достатъчен
        if (budget >= expenses) {
            double leftMoney = budget - expenses;
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", leftMoney);
        }
        //бюджетът не е достатъчен
        else { //budget < expenses
            double needMoney = expenses - budget;
            System.out.printf("%.2f leva needed.", needMoney);
        }
    }
}
