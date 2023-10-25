package Exam.x28And29March2020;

import java.util.Scanner;

public class x02_MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        int delaysCount = (int) Math.floor(distance / 50);
        double currentTime = secondsPerMeter * distance + delaysCount * 30;

        if (currentTime < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", currentTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", currentTime - record);
        }
    }
}
