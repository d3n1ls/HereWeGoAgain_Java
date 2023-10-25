package ConditionalStatements.moreExercise;

import java.util.Scanner;

public class x_02_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekends = Integer.parseInt(scanner.nextLine());
        int gameRate = 30000;
        int worksGame = 63;
        int weekendsGame = 127;
        int totalWeekendsGame = weekends * weekendsGame;
        int totalWorksGame = (365 - weekends) * worksGame;
        int realGameTime = totalWeekendsGame + totalWorksGame;
        int difTime = Math.abs(realGameTime - 30000);
        int hTime = difTime / 60;
        int mTime = difTime % 60;
        if (realGameTime >= gameRate) {
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play", hTime, mTime);
        } else {
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play", hTime, mTime);
        }
    }
}

