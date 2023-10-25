package Exam.x18December2016;

import java.util.Scanner;

public class x01_Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int speed = Integer.parseInt(scanner.nextLine());
        int timeMinutesPlus10 = Integer.parseInt(scanner.nextLine());
        int timeMinutesMinus5 = Integer.parseInt(scanner.nextLine());
        int fullMinutesTime = Integer.parseInt(scanner.nextLine());

        double speedHour = timeMinutesPlus10 / 60.0;
        double speedFirst = speed * speedHour;
        double speedPlus10 = speed + (speed * 0.1);
        double speedMinus5 = speedPlus10 - (speedPlus10 * 0.05);
        double timeAfterRaise = speedPlus10 * (timeMinutesMinus5 / 60.0);
        double timeAfterReduction = speedMinus5 * (fullMinutesTime / 60.0);

        double allSpeed = speedFirst + timeAfterRaise + timeAfterReduction;

        System.out.printf("%.2f", allSpeed);
    }
}
