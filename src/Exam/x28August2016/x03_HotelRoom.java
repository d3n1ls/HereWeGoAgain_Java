package Exam.x28August2016;

import java.util.Scanner;

public class x03_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        double costStudio = 0.0;
        double costApartment = 0.0;

        if ("May".equals(month) || "October".equals(month)) {
            costStudio = countNights * 50.00;
            costApartment = countNights * 65.00;
            if (countNights > 7 && countNights <= 14) {
                costStudio = costStudio - (costStudio * 0.05);
            } else if (countNights > 14) {
                costStudio = costStudio - (costStudio * 0.30);
                costApartment = costApartment - (costApartment * 0.10);
            }
        } else if ("June".equals(month) || "September".equals(month)) {
            costStudio = countNights * 75.20;
            costApartment = countNights * 68.70;
            if (countNights > 14) {
                costStudio = costStudio - (costStudio * 0.20);
                costApartment = costApartment - (costApartment * 0.10);
            }
        } else {
            costStudio = countNights * 76.00;
            costApartment = countNights * 77.00;
            if (countNights > 14) {
                costApartment = costApartment - (costApartment * 0.10);
            }
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", costApartment, costStudio);
    }
}
