package Exam.x9And10March2019;

import java.util.Scanner;

public class x02_Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlMinutes = Integer.parseInt(scanner.nextLine());
        int controlSeconds = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secondsFor100Meters = Integer.parseInt(scanner.nextLine());

        int controlTime = controlMinutes * 60 + controlSeconds;
        double decreaseCount = length / 120;
        double ourTime = length / 100 * secondsFor100Meters - decreaseCount * 2.5;

        if (ourTime <= controlTime) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", ourTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", ourTime - controlTime);
        }
    }
}
