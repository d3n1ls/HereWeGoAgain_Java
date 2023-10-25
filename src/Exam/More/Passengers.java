package Exam.More;

import java.util.Scanner;

public class Passengers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalPassengers = Integer.parseInt(scan.nextLine());
        int stations = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= stations; i++) {
            int passengersOut = Integer.parseInt(scan.nextLine());
            int passengersIn = Integer.parseInt(scan.nextLine());

            totalPassengers -= passengersOut;
            totalPassengers += passengersIn;

            if (i % 2 == 1) {
                totalPassengers += 2;
            } else {
                totalPassengers  -= 2;
            }
        }
        System.out.printf("The final number of passengers is: %d.", totalPassengers);
    }
}
