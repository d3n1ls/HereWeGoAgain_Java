package Exam.x6And7April2019;

import java.util.Scanner;

public class x06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int totalTickets = 0;

        while (true) {
            String movieName = scanner.nextLine();

            if (movieName.equals("Finish")) {
                System.out.printf("Total tickets: %d%n",
                        totalTickets);
                System.out.printf("%.2f%% student tickets.%n",
                        studentTickets * 1.0 / totalTickets * 100);
                System.out.printf("%.2f%% standard tickets.%n",
                        standardTickets * 1.0 / totalTickets * 100);
                System.out.printf("%.2f%% kids tickets.",
                        kidTickets * 1.0 / totalTickets * 100);
                break;
            }
            int availableSpaces = Integer.parseInt(scanner.nextLine());

            int takenSpaces = 0;

            while (true) {
                String ticketType = scanner.nextLine();

                if (ticketType.equals("End")) {
                    System.out.printf("%s - %.2f%% full.%n",
                            movieName, takenSpaces * 1.0 / availableSpaces * 100);
                    break;
                }
                totalTickets++;
                takenSpaces++;

                switch (ticketType) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }
                if (takenSpaces == availableSpaces) {
                    System.out.printf("%s - %.2f%% full.%n", movieName, takenSpaces * 1.0 / availableSpaces * 100);
                    break;
                }
            }
        }
    }
}
