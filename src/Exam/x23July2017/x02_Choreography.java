package Exam.x23July2017;

import java.util.Scanner;

public class x02_Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSteps = Integer.parseInt(scanner.nextLine());
        int countDancers = Integer.parseInt(scanner.nextLine());
        int countDays = Integer.parseInt(scanner.nextLine());

        double dailySteps = (countSteps * 1.0 / countDays) / (countSteps);
        double percentDailySteps = Math.ceil(dailySteps * 100);
        double percentStepsDancer = percentDailySteps / countDancers;

        if (percentDailySteps <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", percentStepsDancer);
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.",
                    percentStepsDancer);
        }
    }
}
