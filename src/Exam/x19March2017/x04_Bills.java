package Exam.x19March2017;

import java.util.Scanner;

public class x04_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMonths = Integer.parseInt(scanner.nextLine());

        double water = 20.0;
        double internet = 15.0;

        double allWater = water * countMonths;
        double allInternet = internet * countMonths;

        double allElectricity = 0;
        double others = 0;
        double allOthers = 0;
        double average = 0;

        for (int i = 0; i < countMonths; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());

            allElectricity += electricity;
            others = allWater + allInternet + allElectricity;
            allOthers = others + (others * 0.2);
            average = (allWater + allInternet + allElectricity + allOthers) / countMonths;
        }
        System.out.printf("Electricity: %.2f lv%n", allElectricity);
        System.out.printf("Water: %.2f lv%n", allWater);
        System.out.printf("Internet: %.2f lv%n", allInternet);
        System.out.printf("Other: %.2f lv%n", allOthers);
        System.out.printf("Average: %.2f lv", average);
    }
}
