package ForLoop.мoreExercises;

import java.util.Scanner;

public class x06_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthsCount = Integer.parseInt(scanner.nextLine());

        int waterBill = 20;
        int internetBill = 15;
        double totalElectricity = 0.0;
        double totalOthers = 0.0;
        double sumBills = 0.0;

        for (int i = 0; i < monthsCount; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());

            totalElectricity += electricityBill;

            double othersBill = (waterBill + internetBill + electricityBill) * 1.2;
            totalOthers += othersBill;

            sumBills += waterBill + internetBill + electricityBill + othersBill;
        }
        System.out.printf("Electricity: %.2f lv%n", totalElectricity);
        System.out.printf("Water: %d.00 lv%n", waterBill * monthsCount);
        System.out.printf("Internet: %d.00 lv%n", internetBill * monthsCount);
        System.out.printf("Other: %.2f lv%n", totalOthers);
        System.out.printf("Average: %.2f lv", sumBills / monthsCount);
    }
}
