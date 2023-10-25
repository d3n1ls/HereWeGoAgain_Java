package Exam.x28And29March2020;

import java.util.Scanner;

public class x05_SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());

        int suitcasesLoaded = 0;
        int counter = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                System.out.println("Congratulations! All suitcases are loaded!");
                break;
            }
            double suitcaseSize = Double.parseDouble(input);
            counter++;

            if (counter % 3 == 0) {
                suitcaseSize *= 1.1;
            }
            if (suitcaseSize > capacity) {
                System.out.println("No more space!");
                break;
            }
            suitcasesLoaded++;
            capacity -= suitcaseSize;
        }
        System.out.printf("Statistic: %d suitcases loaded.", suitcasesLoaded);
    }
}
