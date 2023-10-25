package Exam.x18And19July2020;

import java.util.Scanner;

public class x01_AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String companyName = scanner.nextLine();
        int adultTicketsCount = Integer.parseInt(scanner.nextLine());
        int childTicketsCount = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double taxPrice = Double.parseDouble(scanner.nextLine());

        double childTicketPrice = adultTicketPrice * 0.3;
        double totalProfit = (adultTicketPrice * adultTicketsCount + childTicketPrice * childTicketsCount) +
                (adultTicketsCount + childTicketsCount) * taxPrice;
        totalProfit *= 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",
                companyName, totalProfit);
    }
}
