package Exam.x15And16June2019;

import java.util.Scanner;

public class x01_MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. сума от билетите за 1 ден = бр. билети * цена за 1 билет
        //2. сума от билетите за всички дни = сума за билетите за 1 ден * бр. дни
        //3. изчисляваме печалба за киното = процент * сума от билетите за всички дни
        //4. крайна печалба = сума от билетите за всички дни - изчисляваме печалба за киното

        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine()); //общ брой дни
        int ticketsPerDay = Integer.parseInt(scanner.nextLine()); //билети за 1 ден
        double pricePerTicket = Double.parseDouble(scanner.nextLine());
        int percentForCinema = Integer.parseInt(scanner.nextLine());

        double sumPerDay = ticketsPerDay * pricePerTicket; //сума за ден
        double totalSum = sumPerDay * days; //сума за всички дни
        double profitCinema = totalSum * (percentForCinema / 100.0);
        double profitStudio = totalSum - profitCinema;
        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, profitStudio);
    }
}
