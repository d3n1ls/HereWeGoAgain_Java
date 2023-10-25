package Exam.x20And21April2019;

import java.util.Scanner;

public class x06_EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customers = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        for (int i = 1; i <= customers; i++) {
            String command = scanner.nextLine();
            double sum = 0;
            int counter = 0;

            while (!command.equals("Finish")) {
                switch (command) {
                    case "basket":
                        counter++;
                        sum += 1.5;
                        break;
                    case "wreath":
                        counter++;
                        sum += 3.8;
                        break;
                    case "chocolate bunny":
                        counter++;
                        sum += 7;
                        break;
                }
                command = scanner.nextLine();
            }
            if (counter % 2 == 0) {
                sum *= 0.8;
            }
            totalSum += sum;
            System.out.printf("You purchased %d items for %.2f leva.%n", counter, sum);
        }
        double avgSum = totalSum / customers;
        System.out.printf("Average bill per client is: %.2f leva.%n", avgSum);
    }
}
/*
     int clients = int.Parse(Console.ReadLine());
            double totalPrice = 0.0;

            for (int i = 0; i < clients; i++)
            {
                string command = Console.ReadLine();
                double price = 0.0;
                int productCount = 0;
                while ("Finish" != command)
                {
                    productCount++;
                    switch (command)
                    {
                        case "basket":
                            price += 1.50;
                            break;
                        case "wreath":
                            price += 3.80;
                            break;
                        case "chocolate bunny":
                            price += 7;
                            break;
                    }
                    command = Console.ReadLine();
                }
                if (productCount % 2 == 0)
                {
                    double discount = price * 0.2;
                    price -= discount;
                }
                Console.WriteLine($"You purchased {productCount} items for {price:F2} leva.");
                totalPrice += price;
            }
            Console.WriteLine($"Average bill per client is: {totalPrice / clients:F2} leva.");
     */
