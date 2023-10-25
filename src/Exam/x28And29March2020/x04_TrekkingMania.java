package Exam.x28And29March2020;

import java.util.Scanner;

public class x04_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalClimbers = 0;

        for (int g = 0; g < groupsCount; g++) {
            int groupSize = Integer.parseInt(scanner.nextLine());
            totalClimbers += groupSize;

            if (groupSize <= 5) {
                musala += groupSize;
            } else if (groupSize <= 12) {
                monblan += groupSize;
            } else if (groupSize <= 25) {
                kilimanjaro += groupSize;
            } else if (groupSize <= 40) {
                k2 += groupSize;
            } else {
                everest += groupSize;
            }
        }
        System.out.printf("%.2f%%%n", 1.0 * musala / totalClimbers * 100);
        System.out.printf("%.2f%%%n", 1.0 * monblan / totalClimbers * 100);
        System.out.printf("%.2f%%%n", 1.0 * kilimanjaro / totalClimbers * 100);
        System.out.printf("%.2f%%%n", 1.0 * k2 / totalClimbers * 100);
        System.out.printf("%.2f%%", 1.0 * everest / totalClimbers * 100);
    }
}
