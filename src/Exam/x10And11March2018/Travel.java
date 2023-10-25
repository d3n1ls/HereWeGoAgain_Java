package Exam.x10And11March2018;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distanceBetweenAandB = Double.parseDouble(scanner.nextLine());
        double truckSpeed = Double.parseDouble(scanner.nextLine());
        double differenceBetween = Double.parseDouble(scanner.nextLine());

        double differenceBetweenKm = differenceBetween * 3.6;

        double carSpeed = truckSpeed + differenceBetweenKm;

        double truckTime = distanceBetweenAandB / truckSpeed;
        double carTime = distanceBetweenAandB / carSpeed;

        System.out.printf("The truck arrived after %.0f hours%n", Math.ceil(truckTime));
        System.out.printf("The car arrived after %.0f hours", Math.ceil(carTime));
    }
}
