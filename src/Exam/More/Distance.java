package Exam.More;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double startSpeed = Double.parseDouble(scanner.nextLine());
        double firstTimeInMin = Double.parseDouble(scanner.nextLine());
        double secondTimeInMin = Double.parseDouble(scanner.nextLine());
        double thirdTimeInMin = Double.parseDouble(scanner.nextLine());

        double firstTimeInH = firstTimeInMin/60;
        double secondTimeInH = secondTimeInMin/60;
        double thirdTimeInH = thirdTimeInMin/60;

        double distanceWithStartSpeed = startSpeed*firstTimeInH;
        double speedAfterIncrease = startSpeed+startSpeed*0.10;
        double distanceAfterIncrease = speedAfterIncrease*secondTimeInH;
        double speedAfterReduction = speedAfterIncrease-speedAfterIncrease*0.05;
        double distanceAfterReduction = speedAfterReduction*thirdTimeInH;

        double distance = distanceWithStartSpeed+distanceAfterIncrease+distanceAfterReduction;

        System.out.printf("%.2f", distance);
    }
}
