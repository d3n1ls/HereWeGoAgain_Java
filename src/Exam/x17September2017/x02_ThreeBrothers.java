package Exam.x17September2017;

import java.util.Scanner;

public class x02_ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bro1 = Double.parseDouble(scanner.nextLine());
        double bro2 = Double.parseDouble(scanner.nextLine());
        double bro3 = Double.parseDouble(scanner.nextLine());
        double father = Double.parseDouble(scanner.nextLine());

        double allTime = 1 / (1 / bro1 + 1 / bro2 + 1 / bro3);
        double allTimePlusRest = allTime + (allTime * 0.15);
        double timeLeft = father - allTimePlusRest;


        if (timeLeft > 0) {
            timeLeft = father - allTimePlusRest;
            System.out.printf("Cleaning time: %.2f%n", allTimePlusRest);
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(timeLeft));
        } else {
            timeLeft = allTimePlusRest - father;
            System.out.printf("Cleaning time: %.2f%n", allTimePlusRest);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(timeLeft));
        }
    }
}
