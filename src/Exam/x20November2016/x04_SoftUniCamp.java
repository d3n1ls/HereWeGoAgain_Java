package Exam.x20November2016;

import java.util.Scanner;

public class x04_SoftUniCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroups = Integer.parseInt(scanner.nextLine());

        double allPeople = 0;
        double car = 0;
        double microBus = 0;
        double smallBus = 0;
        double largeBuss = 0;
        double train = 0;
        for (int i = 1; i <= countGroups; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            allPeople += peopleInGroup;

            if (peopleInGroup <= 5) {
                car += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                microBus += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                smallBus += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                largeBuss += peopleInGroup;
            } else {
                train += peopleInGroup;
            }
        }
        System.out.printf("%.2f%%%n", car / allPeople * 100);
        System.out.printf("%.2f%%%n", microBus / allPeople * 100);
        System.out.printf("%.2f%%%n", smallBus / allPeople * 100);
        System.out.printf("%.2f%%%n", largeBuss / allPeople * 100);
        System.out.printf("%.2f%%%n", train / allPeople * 100);
    }
}
