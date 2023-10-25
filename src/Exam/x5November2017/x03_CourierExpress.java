package Exam.x5November2017;

import java.util.Scanner;

public class x03_CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double packKg = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int distanceKm = Integer.parseInt(scanner.nextLine());

        //double packGr = packKg*1000;

        double sum = 0;
        if ("standard".equals(type)) {
            if (packKg < 1) {
                sum = distanceKm * 0.03;
            } else if (packKg >= 1 && packKg <= 10) {
                sum = distanceKm * 0.05;
            } else if (packKg >= 11 && packKg <= 40) {
                sum = distanceKm * 0.10;
            } else if (packKg >= 41 && packKg <= 90) {
                sum = distanceKm * 0.15;
            } else if (packKg >= 91 && packKg <= 150) {
                sum = distanceKm * 0.20;
            }
        } else {
            if (packKg < 1) {
                sum = distanceKm * 0.03 + (distanceKm * (packKg * (0.03 * 0.80)));
            } else if (packKg >= 1 && packKg <= 10) {
                sum = distanceKm * 0.05 + (distanceKm * (packKg * (0.05 * 0.4)));
            } else if (packKg >= 11 && packKg <= 40) {
                sum = distanceKm * 0.10 + (distanceKm * (packKg * (0.10 * 0.05)));
            } else if (packKg >= 41 && packKg <= 90) {
                sum = distanceKm * 0.15 + (distanceKm * (packKg * (0.15 * 0.02)));
            } else if (packKg >= 91 && packKg <= 150) {
                sum = distanceKm * 0.20 + (distanceKm * (packKg * (0.20 * 0.01)));
            }
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", packKg, sum);
    }
}
