package Exam.x25June2017;

import java.util.Scanner;

public class x01_Charity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int cook = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        int cakesAtDay = cakes * 45;
        double wafflesAtDay = waffles * 5.80;
        double pancakesAtDay = pancakes * 3.20;
        double sumDay = (cakesAtDay + wafflesAtDay + pancakesAtDay) * cook;
        double sumAllDays = sumDay * days;
        double sumNet = sumAllDays - (sumAllDays / 8);

        System.out.printf("%.2f", sumNet);
    }
}
