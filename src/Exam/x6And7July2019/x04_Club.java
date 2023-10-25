package Exam.x6And7July2019;

import java.util.Scanner;

public class x04_Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double desiredProfit = Double.parseDouble(scanner.nextLine());

        double currentProfit = 0;

        while (true) {
            String cocktailName = scanner.nextLine();

            if (cocktailName.equals("Party!")) {
                System.out.printf("We need %.2f leva more.%n",
                        desiredProfit - currentProfit);
                break;
            }
            int cocktailsCount = Integer.parseInt(scanner.nextLine());
            double orderPrice = cocktailName.length() * cocktailsCount;

            if (orderPrice % 2 != 0) {
                orderPrice *= 0.75;
            }
            currentProfit += orderPrice;

            if (currentProfit >= desiredProfit) {
                System.out.println("Target acquired.");
                break;
            }
        }
        System.out.printf("Club income - %.2f leva.", currentProfit);
    }
}
