package Exam.x25June2017;

import java.util.Scanner;

public class x02_SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distanceM = Double.parseDouble(scanner.nextLine());
        double ivanSecForM = Double.parseDouble(scanner.nextLine());

        double secDistanceM = distanceM * ivanSecForM;
        double resistance = (Math.floor(distanceM / 15) * 12.5);
        double fullTime = secDistanceM + resistance;

        double slow = fullTime - worldRecord;

        if (fullTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", fullTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", slow);
        }
    }
}
