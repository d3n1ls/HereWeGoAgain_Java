package Exam.x7May2017;

import java.util.Scanner;

public class x04_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityStadium = Integer.parseInt(scanner.nextLine());
        int countFans = Integer.parseInt(scanner.nextLine());

        double sumA = 0;
        double sumB = 0;
        double sumV = 0;
        double sumG = 0;
        for (int i = 1; i <= countFans; i++) {
            String sector = scanner.nextLine();

            if ("A".equalsIgnoreCase(sector)) {
                sumA++;
            } else if ("B".equalsIgnoreCase(sector)) {
                sumB++;
            } else if ("V".equalsIgnoreCase(sector)) {
                sumV++;
            } else if ("G".equalsIgnoreCase(sector)) {
                sumG++;
            }
        }
        double percentAllFans = countFans * 1.0 / capacityStadium * 100.0;

        System.out.printf("%.2f%%%n", sumA / countFans * 100);
        System.out.printf("%.2f%%%n", sumB / countFans * 100);
        System.out.printf("%.2f%%%n", sumV / countFans * 100);
        System.out.printf("%.2f%%%n", sumG / countFans * 100);
        System.out.printf("%.2f%%", percentAllFans);
    }
}
