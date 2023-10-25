package Exam.More;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MasterHerbalist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int dailyExpenses = Integer.parseInt(input);
        int daysForSeason = 0;
        int moneyEarned = 0;

        while (true) {
            input = scanner.nextLine();

            if ("Season Over".equals(input)) {
                break;
            }

            daysForSeason++;

            String[] inputData = input.split("\\s+");

            int hours = Integer.parseInt(inputData[0]);
            char[] path = inputData[1].toCharArray();
            int price = Integer.parseInt(inputData[2]);

            int pathIndex = 0;
            int herbsCollected = 0;

            while (hours > 0) {
                hours--;

                if (path[pathIndex] == 'H') {
                    herbsCollected++;
                }

                pathIndex++;

                if (pathIndex > path.length - 1) {
                    pathIndex = 0;
                }
            }

            moneyEarned += herbsCollected * price;
        }

        int moneyBalanceForSeason = moneyEarned - dailyExpenses * daysForSeason;

        if (moneyBalanceForSeason >= 0) {
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.printf("Times are good. Extra money per day: %s.%n",
                    df.format(moneyBalanceForSeason / (double) daysForSeason));
        } else {
            System.out.printf("We are in the red. Money needed: %d.%n", -moneyBalanceForSeason);
        }
    }
}
