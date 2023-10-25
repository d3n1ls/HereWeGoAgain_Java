package WhileLoop.moreExercises;

import java.util.Scanner;

public class x01_Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int detergentAvailable = Integer.parseInt(scanner.nextLine()) * 750;
        String input = scanner.nextLine();

        int detergentUsed = 0;
        int counter = 0;
        int dishesCount = 0;
        int potsCount = 0;

        while (!input.equals("End")) {
            counter++;
            int itemsCount = Integer.parseInt(input);

            if (counter % 3 == 0) {
                detergentUsed += (itemsCount * 15);
                potsCount += itemsCount;
            } else {
                detergentUsed += (itemsCount * 5);
                dishesCount += itemsCount;
            }

            if (detergentUsed > detergentAvailable) {
                System.out.printf("Not enough detergent, %d ml. more necessary!",
                        detergentUsed - detergentAvailable);
                break;
            }
            input = scanner.nextLine();
        }
        if (detergentUsed <= detergentAvailable) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n",
                    dishesCount, potsCount);
            System.out.printf("Leftover detergent %d ml.", detergentAvailable - detergentUsed);
        }
    }
}
