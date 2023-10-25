package Exam.x18March2017;

import java.util.Scanner;

public class x02_WorkHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int needHour = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        int allHaveHour = countWorkers * (workDays * 8);

        int diff = Math.abs(allHaveHour - needHour);
        if (allHaveHour >= needHour) {
            System.out.printf("%d hours left", diff);
        } else {
            int penalties = diff * workDays;
            System.out.printf("%d overtime%nPenalties: %d", diff, penalties);
        }
    }
}
