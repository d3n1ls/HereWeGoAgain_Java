package Exam.x26March2016;

import java.util.Scanner;

public class x04_ModularDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double modTwo = 0;
        double modThree = 0;
        double modFour = 0;

        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(scanner.nextLine());

            if (current % 2 == 0) {
                modTwo++;
            }

            if (current % 3 == 0) {
                modThree++;
            }

            if (current % 4 == 0) {
                modFour++;
            }
        }
        modTwo = modTwo / n * 100.0;
        modThree = modThree / n * 100.0;
        modFour = modFour / n * 100.0;

        System.out.printf("%.2f%%%n", modTwo);
        System.out.printf("%.2f%%%n", modThree);
        System.out.printf("%.2f%%%n", modFour);
    }
}
