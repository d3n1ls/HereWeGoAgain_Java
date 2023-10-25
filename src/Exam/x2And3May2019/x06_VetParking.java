package Exam.x2And3May2019;

import java.util.Scanner;

public class x06_VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());

        double sumAllDays = 0.0;
        //обхождаме всички дни от първия до последния
        for (int day = 1; day <= days; day++) {
            //обхождаме всички часове
            double sumPerDay = 0.0; //сумата за всеки един ден
            for (int hour = 1; hour <= hoursPerDay; hour++) {
                //четен ден и нечетен час -- 2.50
                if (day % 2 == 0 && hour % 2 == 1) {
                    sumPerDay += 2.50;
                }
                //нечетен ден и четен час -- 1.25
                else if (day % 2 == 1 && hour % 2 == 0) {
                    sumPerDay += 1.25;
                }
                //четен ден и четен час или нечетен ден и нечетен час -- 1
                else {
                    sumPerDay += 1;
                }
            }
            sumAllDays += sumPerDay;
            System.out.printf("Day: %d - %.2f leva%n", day, sumPerDay);
        }
        System.out.printf("Total: %.2f leva", sumAllDays);
    }
}
