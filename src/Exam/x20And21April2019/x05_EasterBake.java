package Exam.x20And21April2019;

import java.util.Scanner;

public class x05_EasterBake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int breadsCnt = Integer.parseInt(scan.nextLine());

        int totalFlower = 0;
        int totalSugar = 0;
        int maxFlower = 0;
        int maxSugar = 0;

        for (int i = 0; i < breadsCnt; i++) {

            int sugar = Integer.parseInt(scan.nextLine());
            int flower = Integer.parseInt(scan.nextLine());
            if (flower > maxFlower) {
                maxFlower = flower;
            }
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            totalSugar += sugar;
            totalFlower += flower;

        }
        double packetSugar = Math.ceil(totalSugar*1.0 /950);
        double packetFlour = Math.ceil(totalFlower *1.0/750);

        System.out.printf("Sugar: %.0f%n",packetSugar);
        System.out.printf("Flour: %.0f%n",packetFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxFlower,maxSugar);
    }
}
    /*
     int kozunatsi = int.Parse(Console.ReadLine());

            //пакет брашно -> 750гр.
            //пакет захар -> 950гр.

            int totalSugar = 0;
            int totalFloor = 0;


            int maxFlour = int.MinValue;
            int maxSugar = int.MinValue;

            for (int i = 1; i <= kozunatsi; i++)
            {
                int sugar = int.Parse(Console.ReadLine());
                int floor = int.Parse(Console.ReadLine());

                totalFloor += floor;
                totalSugar += sugar;

                if (floor > maxFlour)
                {
                    maxFlour = floor;
                }

                if (sugar > maxSugar)
                {
                    maxSugar = sugar;
                }

            }

            Console.WriteLine($"Sugar: {Math.Ceiling(totalSugar / 950.0)}");
            Console.WriteLine($"Flour: {Math.Ceiling(totalFloor / 750.0)}");

            Console.WriteLine($"Max used flour is {maxFlour} grams, max used sugar is {maxSugar} grams.");

     */

