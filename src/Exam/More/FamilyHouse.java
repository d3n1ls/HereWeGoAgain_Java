package Exam.More;

import java.util.Scanner;

public class FamilyHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int months = Integer.parseInt(scan.nextLine());

        double water = months * 20;
        double internet = months * 15;
        double electricity = 0;
        double others = 0;

        for (int i = 1; i <= months; i++) {
            double billElectricity = Double.parseDouble(scan.nextLine());
            electricity += billElectricity;
            others += (billElectricity + 20 + 15) + ((billElectricity + 20 + 15) * 0.2);
        }

        double average = (electricity + water + internet + others) / months;

        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", others);
        System.out.printf("Average: %.2f lv", average);
    }
}
