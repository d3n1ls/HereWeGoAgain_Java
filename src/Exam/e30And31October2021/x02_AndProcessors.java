package Exam.e30And31October2021;

import java.util.Scanner;

public class x02_AndProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countProcessors = Integer.parseInt(scanner.nextLine());
        int countEmployees = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hours = days * 8 * countEmployees;
        int processors = (int) Math.floor(hours / 3);


        double neededProfit = countEmployees * 110.10;

        if (processors >= countProcessors) {
            double profit = (processors - countProcessors) * 110.10;
            System.out.printf("Profit: -> %.2f BGN", profit);
        } else {
            double losses = (countProcessors - processors) * 110.10;
            System.out.printf("Losses: -> %.2f BGN", losses);
        }

    }
}
