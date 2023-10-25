package Exam.x20And21April2019;

import java.util.Scanner;

public class x04_EasterShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int firstNumOfEggs=Integer.parseInt(scanner.nextLine());
        String command=scanner.nextLine();
        int soldEggs=0;
        boolean isEnough=false;

        while(!command.equalsIgnoreCase("Close")){
            int number=Integer.parseInt(scanner.nextLine());

            if (command.equalsIgnoreCase("Buy")) {
                if (number>firstNumOfEggs) {
                    //System.out.printf("Not enough eggs in store!%n");
                    //System.out.printf("You can buy only %d.",firstNumOfEggs);
                    soldEggs+=firstNumOfEggs;
                    isEnough=true;
                    break;
                }
                if (firstNumOfEggs>=number) {
                    firstNumOfEggs-=number;
                    soldEggs+=number;
                }
            }
            if (command.equalsIgnoreCase("Fill")) {
                firstNumOfEggs+=number;
            }
            command=scanner.nextLine();
        }

        if (isEnough) {
            System.out.printf("Not enough eggs in store!%n");
            System.out.printf("You can buy only %d.",firstNumOfEggs);
        } else {
            System.out.printf("Store is closed!%n");
            System.out.printf("%d eggs sold.",soldEggs);
        }
    }
}
    /*
     int eggsCount = int.Parse(Console.ReadLine());

            int soldEggs = 0;

            string command = Console.ReadLine();
            while ("Close" != command)
            {
                if ("Fill" == command)
                {
                    int toFill = int.Parse(Console.ReadLine());
                    eggsCount += toFill;
                }
                if ("Buy" == command)
                {
                    int count = int.Parse(Console.ReadLine());
                    if (count <= eggsCount)
                    {
                        eggsCount -= count;
                        soldEggs += count;
                    }
                    else
                    {
                        Console.WriteLine("Not enough eggs in store!");
                        Console.WriteLine($"You can buy only {eggsCount}.");
                        break;
                    }
                }
                command = Console.ReadLine();
            }
            if ("Close" == command)
            {
                Console.WriteLine("Store is closed!");
                Console.WriteLine($"{soldEggs} eggs sold.");
     */

