package Exam.x22And23August2020;

import java.util.Scanner;

public class Rate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double simpleRate = money;
        double complexRate = money;
        String rate = "";

        for (int i = 0; i < months; i++) {
            simpleRate += (money * 0.03);
            complexRate += (complexRate * 0.027);
        }

        if (simpleRate < complexRate) {
            rate = "complex";
        } else if (simpleRate > complexRate) {
            rate = "simple";
        }

        System.out.printf("Simple interest rate: %.2f lv.\n", simpleRate);
        System.out.printf("Complex interest rate: %.2f lv.\n", complexRate);
        System.out.printf("Choose a %s interest rate. You will win %.2f lv.", rate, Math.abs(simpleRate - complexRate));
        scan.close();
    }
}
