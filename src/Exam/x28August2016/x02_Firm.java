package Exam.x28August2016;

import java.text.DecimalFormat;
import java.util.Scanner;

public class x02_Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

        int needHours = Integer.parseInt(scanner.nextLine());
        int haveDays = Integer.parseInt(scanner.nextLine());
        int countWorkersExtra = Integer.parseInt(scanner.nextLine());

        double minusTraining = haveDays - (haveDays * 0.1);
        double haveHour = minusTraining * 8;
        double extraHours = Math.floor(countWorkersExtra * (haveDays * 2));
        double allHour = Math.floor(haveHour + extraHours);

        double left = 0.0;
        double need = 0.0;

        if (needHours <= allHour) {
            left = allHour - needHours;
            System.out.printf("Yes!%s hours left.", df.format(left));
        } else {
            need = needHours - allHour;
            System.out.printf("Not enough time!%s hours needed.", df.format(need));
        }
    }
}
