package Exam.x20November2016;

import java.util.Scanner;

public class x06_Battles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int battles = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        for (int i = 1; i <= first; i++) {
            for (int j = 1; j <= second; j++) {
                counter++;
                System.out.printf("(%d <-> %d) ", i, j);
                if (battles == counter) {
                    break;
                }
            }
            if (battles == counter) {
                break;
            }
        }
    }
}
