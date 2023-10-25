package Exam.x23July2017;

import java.util.Scanner;

public class x01_DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hallLm = Double.parseDouble(scanner.nextLine());
        double hallWm = Double.parseDouble(scanner.nextLine());
        double closetAm = Double.parseDouble(scanner.nextLine());

        double hallAreaCm = (hallLm * 100.0) * (hallWm * 100.0);

        double closetAreaCm = (closetAm * 100.0) * (closetAm * 100.0);
        double bench = hallAreaCm / 10.0;
        double freeSpace = hallAreaCm - closetAreaCm - bench;

        double countDancer = freeSpace / (40.0 + 7000.0);

        System.out.printf("%.0f", Math.floor(countDancer));
    }
}
