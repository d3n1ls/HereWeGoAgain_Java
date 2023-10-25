package Exam.x20And21April2019;

import java.util.Scanner;

public class x05_EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int egg = Integer.parseInt(scanner.nextLine());
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int maxNum = Integer.MIN_VALUE;

        String maxEgg = "";
        for (int i = 0; i < egg; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    red++;
                    if (red > maxNum) {
                        maxNum = red;
                        maxEgg = "red";
                    }
                    break;
                case "orange":
                    orange++;
                    if (orange > maxNum) {
                        maxNum = orange;
                        maxEgg = "orange";
                    }
                    break;
                case "blue":
                    blue++;
                    if (blue > maxNum) {
                        maxNum = blue;
                        maxEgg = "blue";
                    }
                    break;
                case "green":
                    green++;
                    if (green > maxNum) {
                        maxNum = green;
                        maxEgg = "green";
                    }
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);
        System.out.printf("Max eggs: %d -> %s%n", maxNum, maxEgg);
    }
}

/*
     int countEggs = int.Parse(Console.ReadLine());

            int countRed = 0;
            int countOrange = 0;
            int countBlue = 0;
            int countGreen = 0;

            int maxCount = int.MinValue;
            String maxEggs = String.Empty;


            for (int i = 1; i <= countEggs; i++)
            {
                String color = Console.ReadLine();

                switch (color)
                {
                    case "red":
                        countRed++;
                        break;
                    case "orange":
                        countOrange++;
                        break;
                    case "blue":
                        countBlue++;
                        break;
                    case "green":
                        countGreen++;
                        break;
                }
            }

            if (countBlue >= maxCount)
            {
                maxCount = countBlue;
                maxEggs = "blue";
            }

            if (countRed >= maxCount)
            {
                maxCount = countRed;
                maxEggs = "red";
            }

            if (countOrange >= maxCount)
            {
                maxCount = countOrange;
                maxEggs = "orange";
            }

            if (countGreen >= maxCount)
            {
                maxCount = countGreen;
                maxEggs = "green";
            }

            Console.WriteLine($"Red eggs: {countRed}");
            Console.WriteLine($"Orange eggs: {countOrange}");
            Console.WriteLine($"Blue eggs: {countBlue}");
            Console.WriteLine($"Green eggs: {countGreen}");

            Console.WriteLine($"Max eggs: {maxCount} -> {maxEggs}");
     */