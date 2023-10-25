package Exam.x20And21April2019;

import java.util.Scanner;

public class x03_EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String date = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        int price = 0;

        switch (destination) {
            case ("France"):
                if (date.equals("21-23")) {
                    price = 30;
                } else if (date.equals("24-27")) {
                    price = 35;
                } else if (date.equals("28-31")) {
                    price = 40;
                }
                break;
            case ("Italy"):
                if (date.equals("21-23")) {
                    price = 28;
                } else if (date.equals("24-27")) {
                    price = 32;
                } else if (date.equals("28-31")) {
                    price = 39;
                }
                break;
            case ("Germany"):
                if (date.equals("21-23")) {
                    price = 32;
                } else if (date.equals("24-27")) {
                    price = 37;
                } else if (date.equals("28-31")) {
                    price = 43;
                }
                break;
        }
        double totalPrice = price * nights;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalPrice);
    }
}
/*
     String country = Console.ReadLine();
            String dates = Console.ReadLine();
            int days = int.Parse(Console.ReadLine());
            double pricePerNight = 0;

            switch (country)
            {
                case "France":
                    switch (dates)
                    {
                        case "21-23": pricePerNight = 30; break;
                        case "24-27": pricePerNight = 35; break;
                        case "28-31": pricePerNight = 40; break;
                    }
                    break;
                case "Italy":
                    switch (dates)
                    {
                        case "21-23": pricePerNight = 28; break;
                        case "24-27": pricePerNight = 32; break;
                        case "28-31": pricePerNight = 39; break;
                    }
                    break;
                case "Germany":
                    switch (dates)
                    {
                        case "21-23": pricePerNight = 32; break;
                        case "24-27": pricePerNight = 37; break;
                        case "28-31": pricePerNight = 43; break;
                    }
                    break;
            }

            double totalPrice = days * pricePerNight;

            Console.WriteLine($"Easter trip to {country} : {totalPrice:F2} leva.");
     */
