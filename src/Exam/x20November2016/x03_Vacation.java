package Exam.x20November2016;

import java.util.Scanner;

public class x03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countAdult = Integer.parseInt(scanner.nextLine());
        int countToddler = Integer.parseInt(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());
        String transport = scanner.nextLine();

        double priceAdult = 0.0;
        double priceToddler = 0.0;
        double priceAllTransport = 0.0;

        if ("train".equals(transport)) {
            priceAdult = countAdult * 24.99;
            priceToddler = countToddler * 14.99;
            priceAllTransport = (priceAdult + priceToddler) * 2;
            if ((countAdult + countToddler) >= 50) {
                priceAllTransport = priceAllTransport - (priceAllTransport * 0.50);
            }
        } else if ("bus".equals(transport)) {
            priceAdult = countAdult * 32.50;
            priceToddler = countToddler * 28.50;
            priceAllTransport = (priceAdult + priceToddler) * 2;
        } else if ("boat".equals(transport)) {
            priceAdult = countAdult * 42.99;
            priceToddler = countToddler * 39.99;
            priceAllTransport = (priceAdult + priceToddler) * 2;
        } else {
            priceAdult = countAdult * 70.00;
            priceToddler = countToddler * 50.00;
            priceAllTransport = (priceAdult + priceToddler) * 2;
        }

        double allPrice = (countNights * 82.99) + priceAllTransport;
        double totalPriceTax = allPrice + (allPrice * 0.10);

        System.out.printf("%.2f", totalPriceTax);
    }
}
