package ConditionalStatements.exercise;

import java.util.Scanner;

public class x06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeSec = Double.parseDouble(scanner.nextLine());
        double delay = (Math.floor(distance / 15)) * 12.5;
        double time = distance * timeSec + delay;
        double neededSec = Math.abs(time - worldRecord);
        if (time < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        }
        if (time >= worldRecord) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededSec);
        }
    }
}
