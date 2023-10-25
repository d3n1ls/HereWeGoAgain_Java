package Exam.x20And21April2019;

import java.util.Scanner;

public class x06_EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bread = Integer.parseInt(scanner.nextLine());
        String winner = "";
        int maxNum = 0;

        for (int i = 1; i <= bread; i++) {
            String bakerName = scanner.nextLine();
            int result = 0;
            String command = scanner.nextLine();

            while (!command.equals("Stop")) {
                int points = Integer.parseInt(command);
                result += points;
                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", bakerName, result);

            if (result > maxNum) {
                maxNum = result;
                System.out.printf("%s is the new number 1!%n", bakerName);
                winner = bakerName;
            }
        }
        System.out.printf("%s won competition with %d points!", winner, maxNum);
    }
}
 /*
      int count = int.Parse(Console.ReadLine());
            string bestBakerName = "";
            int bestBakerPoints = -1;

            for (int i = 0; i < count; i++)
            {
                string bakerName = Console.ReadLine();
                int points = 0;
                string command = Console.ReadLine();

                while ("Stop" != command)
                {
                    points += int.Parse(command);
                    command = Console.ReadLine();
                }

                Console.WriteLine($"{bakerName} has {points} points.");
                if (points > bestBakerPoints)
                {
                    bestBakerName = bakerName;
                    bestBakerPoints = points;
                    Console.WriteLine($"{bakerName} is the new number 1!");
                }
            }
            Console.WriteLine($"{bestBakerName} won competition with {bestBakerPoints} points!");
 */
