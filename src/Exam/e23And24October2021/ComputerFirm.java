package Exam.e23And24October2021;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computersCount = Integer.parseInt(scanner.nextLine());

        double salesCount = 0;
        double averageRating = 0;

        for (int i = 0; i < computersCount; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            int currRating = number % 10;
            averageRating += currRating;
            number /= 10;

            switch (currRating) {
                case 3:
                    salesCount += 0.5 * number;
                    break;
                case 4:
                    salesCount += 0.7 * number;
                    break;
                case 5:
                    salesCount += 0.85 * number;
                    break;
                case 6:
                    salesCount += number;
                    break;
            }
        }

        System.out.printf("%.2f%n", salesCount);
        System.out.printf("%.2f", averageRating / computersCount);
    }
}
