package Exam.x6And7July2019;

import java.util.Scanner;

public class x04_Club01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double desiredIncome = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double sum = 0;
        double income = 0;

        while (!command.equals("Party!")) {
            int priceCoctail = command.length();
            int coctails = Integer.parseInt(scanner.nextLine());
            sum = priceCoctail * coctails;

            if (sum % 2 != 0) {
                sum = sum * 0.75;
            }
            income += sum;
            if (income >= desiredIncome) {
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Party!")) {
            System.out.printf("We need %.2f leva more.\n", desiredIncome - income);
        } else {
            System.out.println("Target acquired.");
        }
        System.out.printf("Club income - %.2f leva.", income);
    }
}
