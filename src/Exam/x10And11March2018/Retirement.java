package Exam.x10And11March2018;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int work = Integer.parseInt(scanner.nextLine());

        boolean oldEnough = true;
        boolean workedEnough = true;

        int diffAge = 0;
        int diffWork = 0;
        if ("male".equals(gender)) {
            oldEnough = age >= 64;
            workedEnough = work >= 38;
            diffAge = 64 - age;
            diffWork = 38 - work;
        } else if ("female".equals(gender)) {
            oldEnough = age >= 61;
            workedEnough = work >= 35;
            diffAge = 61 - age;
            diffWork = 35 - work;
        } else {
            System.out.println("Invalid input.");
            return;
        }
        if (oldEnough && workedEnough) {
            System.out.printf("Ready to retire at %d and %d years of experience!", age, work);
        } else if (workedEnough && !oldEnough) {
            System.out.printf("Worked enough, but not old enough. Years left to retirement: %d.", diffAge);
        } else if (oldEnough && !workedEnough) {
            System.out.printf("Old enough, but haven't worked enough. Work experience left to retirement: %d.", diffWork);
        } else if (!oldEnough && !workedEnough) {
            System.out.printf("Too early. Years left to retirement: %d. Work experience left to retirement: %d.", diffAge, diffWork);
        }
    }
}
