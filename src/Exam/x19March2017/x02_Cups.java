package Exam.x19March2017;

import java.util.Scanner;

public class x02_Cups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int needCups = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        double allHour = countWorkers * (workDays * 8);
        double haveCups = Math.floor(allHour / 5);

        double need = 0;
        double left = 0;

        if (haveCups < needCups) {
            need = needCups - haveCups;
            System.out.printf("Losses: %.2f", need * 4.2);
        } else {
            left = haveCups - needCups;
            System.out.printf("%.2f extra money", left * 4.2);
        }
    }
}
