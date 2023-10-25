package Exam.x20And21April2019;

import java.util.Scanner;

public class x03_PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (size) {
            case "Large":
                if ("Red" == color) {
                    price = 16;
                } else if ("Green" == color) {
                    price = 12;
                } else if ("Yellow" == color) {
                    price = 9;
                }
                break;
            case "Medium":
                if ("Red" == color) {
                    price = 13;
                } else if ("Green" == color) {
                    price = 9;
                } else if ("Yellow" == color) {
                    price = 7;
                }
                break;
            case "Small":
                if ("Red" == color) {
                    price = 9;
                } else if ("Green" == color) {
                    price = 8;
                } else if ("Yellow" == color) {
                    price = 5;
                }
                break;
        }
        double totalPrice = count * price;
        double expenses = totalPrice * 0.35;
        totalPrice -= expenses;

        System.out.printf("%.2f leva.", totalPrice);

    }
}
    /*
     string size = Console.ReadLine();
            string color = Console.ReadLine();
            int count = int.Parse(Console.ReadLine());
            double price = 0;

            switch (size)
            {
                case "Large":
                    if ("Red" == color)
                    {
                        price = 16;
                    }
                    else if ("Green" == color)
                    {
                        price = 12;
                    }
                    else if ("Yellow" == color)
                    {
                        price = 9;
                    }
                    break;
                case "Medium":
                    if ("Red" == color)
                    {
                        price = 13;
                    }
                    else if ("Green" == color)
                    {
                        price = 9;
                    }
                    else if ("Yellow" == color)
                    {
                        price = 7;
                    }
                    break;
                case "Small":
                    if ("Red" == color)
                    {
                        price = 9;
                    }
                    else if ("Green" == color)
                    {
                        price = 8;
                    }
                    else if ("Yellow" == color)
                    {
                        price = 5;
                    }
                    break;
            }

            double totalPrice = count * price;
            double expenses = totalPrice * 0.35;
            totalPrice -= expenses;

            Console.WriteLine($"{totalPrice:F2} leva.");
     */

