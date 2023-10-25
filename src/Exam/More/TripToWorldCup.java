package Exam.More;

import java.util.Scanner;

public class TripToWorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double TicketOnGoing = Double.parseDouble(scanner.nextLine());
        double TicketOnReturn = Double.parseDouble(scanner.nextLine());
        double TickeOneMatch = Double.parseDouble(scanner.nextLine());
        int numOfMatches = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double ticketFlight = 6 * (TicketOnGoing + TicketOnReturn);
        double ticketDiscount = (percent * 1.0) / 100;
        double allSUmofTickets = ticketFlight - (ticketFlight * ticketDiscount);
        double sumMatches = (TickeOneMatch * numOfMatches) * 6;

        /*System.out.println(ticketFlight);
        System.out.println(ticketDiscount);
        System.out.println(allSUmofTickets);
        System.out.println(sumMatches);*/

        double AllSum = allSUmofTickets + sumMatches;

        System.out.printf("Total sum: %.2f lv.%n", AllSum);
        System.out.printf("Each friend has to pay %.2f lv.", AllSum / 6);
    }
}
