package Exam.x28And29March2020;

import java.util.Scanner;

public class x05_CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodAvailable = Integer.parseInt(scanner.nextLine()) * 1000;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Adopted")) {
                break;
            }
            foodAvailable -= Integer.parseInt(input);
        }
        if (foodAvailable >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodAvailable);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", foodAvailable * -1);
        }
    }
}
