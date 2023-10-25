package Exam.More;

import java.util.Scanner;

public class ShootingDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int timeShooting = Integer.parseInt(scan.nextLine());
        int scenes = Integer.parseInt(scan.nextLine());
        int sceneTime = Integer.parseInt(scan.nextLine());
        double terain = 0.15 * timeShooting;
        int shooting = scenes * sceneTime;
        double total = terain + shooting;
        if (timeShooting > total) {
            double timeLeft = Math.abs(timeShooting - total);
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",timeLeft);
        } else if (total > timeShooting)
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", total - timeShooting);

    }
}
