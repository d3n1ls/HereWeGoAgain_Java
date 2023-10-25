package Exam.x18And19July2020;

import java.util.Scanner;

public class x03_AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int joineryCount = Integer.parseInt(scanner.nextLine());

        if (joineryCount < 10) {
            System.out.println("Invalid order");
            return;
        }
        String joineryType = scanner.nextLine();
        String wayOfReceiving = scanner.nextLine();

        double price = 0;

        switch (joineryType) {
            case "90X130":
                price = 110;

                if (joineryCount > 60) {
                    price *= 0.92;
                } else if (joineryCount > 30) {
                    price *= 0.95;
                }
                break;
            case "100X150":
                price = 140;

                if (joineryCount > 80) {
                    price *= 0.9;
                } else if (joineryCount > 40) {
                    price *= 0.94;
                }
                break;
            case "130X180":
                price = 190;

                if (joineryCount > 50) {
                    price *= 0.88;
                } else if (joineryCount > 20) {
                    price *= 0.93;
                }
                break;
            case "200X300":
                price = 250;

                if (joineryCount > 50) {
                    price *= 0.86;
                } else if (joineryCount > 25) {
                    price *= 0.91;
                }
                break;
        }
        price *= joineryCount;

        if (wayOfReceiving.equals("With delivery")) {
            price += 60;
        }
        if (joineryCount > 99) {
            price *= 0.96;
        }
        System.out.printf("%.2f BGN",
                price);
    }
}
