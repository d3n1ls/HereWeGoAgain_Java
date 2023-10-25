package Exam.More;

import java.util.Scanner;

public class PaintingDay {
    public static void main(String[] args) {
        //Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        //Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        //Количество разредител (в литри) - цяло число в интервала [1…30]
        //Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
        Scanner scan = new Scanner(System.in);
        int nailonNeed = Integer.parseInt(scan.nextLine()); //вход за необходимо количество наелон
        int paintNeed = Integer.parseInt(scan.nextLine()); //вход за необходимо количество боя
        int razreditel = Integer.parseInt(scan.nextLine()); //разредител
        int hoursWork = Integer.parseInt(scan.nextLine());
        double additionalNailon = (nailonNeed + 2) * 1.50;
        double additionalPaint = 0.1 * paintNeed;
        double totalPaintPrice = (paintNeed + additionalPaint) * 14.50;
        double totalRazreditel = razreditel * 5.00;
        double totalMaterials = additionalNailon + totalPaintPrice + totalRazreditel + 0.40;
        double workerSalary = 0.30 * totalMaterials;
        double workerSalaryHours = workerSalary * hoursWork;
        double total = totalMaterials + workerSalaryHours;
        System.out.printf("Total expenses: %.2f lv.", total);

    }
}
