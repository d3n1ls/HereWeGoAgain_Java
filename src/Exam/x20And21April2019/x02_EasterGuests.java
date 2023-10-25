package Exam.x20And21April2019;

import java.util.Scanner;

public class x02_EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfGuests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int numOfEasterBread = 0;
        if (numOfGuests % 3 == 0) {
            numOfEasterBread = numOfGuests / 3;
        } else {
            numOfEasterBread = (numOfGuests / 3) + 1;
        }
        // int numOfEasterBread=(numOfGuests/3);
        int numOfEggs = numOfGuests * 2;

        double sumOfEasterBread = (numOfEasterBread * 1.0) * 4;
        double sumOfEggs = (numOfEggs * 1.0) * 0.45;

        double allSum = sumOfEasterBread + sumOfEggs;

        if (budget >= allSum) {
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.%n", numOfEasterBread, numOfEggs);
            System.out.printf("He has %.2f lv. left.", budget - allSum);
        } else {
            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more.", allSum - budget);
        }
    }
}
    /*
    int guests = int.Parse(Console.ReadLine()); // Прочитаме броя на гостите
            int budget = int.Parse(Console.ReadLine()); // Прочитаме бюджета

            double easterBread = Math.Ceiling(guests / 3.0); // Излисляваме броя на козунаците
            int eggs = guests * 2; // Изчисляваме броя на яйцата

            double easterBreadPrice = easterBread * 4; // Изчисляваме цената за всичи козунаци
            double eggsPrice = eggs * 0.45; // Изчисляваме цената за всички яйца

            double totalPrice = easterBreadPrice + eggsPrice; // Намираме общата цена

            if (totalPrice <= budget)
            {
                double moneyLeft = budget - totalPrice; // Изчисляваме парите, които остават
                Console.WriteLine($"Lyubo bought {easterBread} Easter bread and {eggs} eggs.");
                Console.WriteLine($"He has {moneyLeft:F2} lv. left.");
            }
            else
            {
                double moneyNeed = totalPrice - budget; // Изчисляваме парите, които не достигат
                Console.WriteLine("Lyubo doesn't have enough money.");
                Console.WriteLine($"He needs {moneyNeed:F2} lv. more.");
     */

