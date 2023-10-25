package Exam.x10And11March2018;

import java.util.Scanner;

public class PcStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceCPU = Double.parseDouble(scanner.nextLine());
        double priceVideoCard = Double.parseDouble(scanner.nextLine());
        double priceRam = Double.parseDouble(scanner.nextLine());
        double ramCount = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double priceCPULeva = priceCPU * 1.57;
        double priceVideoCardLeva = priceVideoCard * 1.57;
        double priceRamLeva = priceRam * 1.57;
        priceRamLeva *= ramCount;

        double priceForProcAfterDiscount = priceCPULeva - (priceCPULeva * discount);
        double priceForVideoCardAfterDiscount = priceVideoCardLeva - (priceVideoCardLeva * discount);

        double totalSum = priceForVideoCardAfterDiscount + priceForProcAfterDiscount + priceRamLeva;

        System.out.printf("Money needed - %.2f leva.", totalSum);
    }
}
