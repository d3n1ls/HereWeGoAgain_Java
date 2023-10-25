package Exam.x23July2017;

import java.util.Scanner;

public class x04_EnergyLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dancers = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int energySum = 0;
        for (int i = 1; i <= days; i++) {
            int hours = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0 && hours % 2 == 0) {
                sum = dancers * 68;
            } else if (i % 2 != 0 && hours % 2 == 0) {
                sum = dancers * 49;
            } else if (i % 2 == 0 && hours % 2 != 0) {
                sum = dancers * 65;
            } else {
                sum = dancers * 30;
            }

            energySum += sum;
        }
        double allDaysEnergy = 100.0 * dancers * days;
        double leftEnergy = allDaysEnergy - energySum;
        double energyPerDancer = leftEnergy / dancers / days;

        double diff = 100 - energyPerDancer;
        if (diff < 50) {
            System.out.printf("They feel good! Energy left: %.2f", energyPerDancer);
        } else {
            System.out.printf("They are wasted! Energy left: %.2f", energyPerDancer);
        }
    }
}
