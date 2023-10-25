package Exam.x20November2016;

import java.util.Scanner;

public class x06_MaxCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        for (int i = start; i <= stop; i++) {
            for (int j = start; j <= stop; j++) {
                counter++;
                System.out.printf("<%d-%d>", i, j);
                if (counter == max) {
                    break;
                }
            }
            if (counter == max) {
                break;
            }
        }
    }
}
