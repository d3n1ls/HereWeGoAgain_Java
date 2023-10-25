package Exam.x10And11March2018;

import java.util.Scanner;

public class ArenaTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arenaPoints = Integer.parseInt(scanner.nextLine());
        String arenaName = scanner.nextLine();
        String day = scanner.nextLine();
        String itemSetName = scanner.nextLine();

        double itemSetPrice = 0;
        double pricePerItem = 0;
        int counter = 0;

        if ("Poor".endsWith(itemSetName)) {
            itemSetPrice = 7000;
        } else if ("Normal".endsWith(itemSetName)) {
            itemSetPrice = 14000;
        } else if ("Legendary".endsWith(itemSetName)) {
            itemSetPrice = 21000;
        }
        if ("Nagrand".equals(arenaName)) {
            double discount = 0;
            if ("Monday".equals(day) || "Wednesday".equals(day)) {
                discount = 0.05;
            }

            itemSetPrice = itemSetPrice - (itemSetPrice * discount);

            pricePerItem = itemSetPrice / 5;

            while (arenaPoints >= pricePerItem) {
                counter++;
                arenaPoints -= (int) pricePerItem;
                if (counter == 5) {
                    break;
                }
            }
        } else if ("Gurubashi".equals(arenaName)) {
            double discount = 0;
            if ("Tuesday".equals(day) || "Thursday".equals(day)) {
                discount = 0.1;
            }
            itemSetPrice = itemSetPrice - (itemSetPrice * discount);

            pricePerItem = itemSetPrice / 5;

            while (arenaPoints >= pricePerItem) {
                counter++;
                arenaPoints -= (int) pricePerItem;
                if (counter == 5) {
                    break;
                }
            }
        } else if ("Dire Maul".equals(arenaName)) {
            double discount = 0;
            if ("Friday".equals(day) || "Saturday".equals(day)) {
                discount = 0.07;
            }

            itemSetPrice = itemSetPrice - (itemSetPrice * discount);

            pricePerItem = itemSetPrice / 5;

            while (arenaPoints >= pricePerItem) {
                counter++;
                arenaPoints -= (int) pricePerItem;
                if (counter == 5) {
                    break;
                }
            }
        }
        if (counter == 5) {
            System.out.printf("Items bought: %d%n", counter);
            System.out.printf("Arena points left: %d%n", arenaPoints);
            System.out.println("Success!");
        } else {
            System.out.printf("Items bought: %d%n", counter);
            System.out.printf("Arena points left: %d%n", arenaPoints);
            System.out.println("Failure!");
        }
    }
}
