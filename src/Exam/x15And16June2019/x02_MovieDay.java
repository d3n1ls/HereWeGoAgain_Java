package Exam.x15And16June2019;

import java.util.Scanner;

public class x02_MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeAvailable = Integer.parseInt(scanner.nextLine());
        int scenesCount = Integer.parseInt(scanner.nextLine());
        int sceneDuration = Integer.parseInt(scanner.nextLine());

        double preparationTime = timeAvailable * 0.15;
        double timeNeeded = preparationTime + (scenesCount * sceneDuration);

        if (timeNeeded <= timeAvailable) {
            System.out.printf("You managed to finish the movie on time!" +
                    " You have %d minutes left!", Math.round(timeAvailable - timeNeeded));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(timeNeeded - timeAvailable));
        }
    }
}
