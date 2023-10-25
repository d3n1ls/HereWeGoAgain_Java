package Exam.x25June2017;

import java.util.Scanner;

public class x04_MoneyPrize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pieceProject = Integer.parseInt(scanner.nextLine());
        double moneyAtPoint = Double.parseDouble(scanner.nextLine());

        double sumEven = 0.0;
        double sumOdd = 0.0;
        double allSum = 0.0;

        for (int i = 1; i <= pieceProject; i++) {
            int points = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                sumEven += points * 2;
            } else {
                sumOdd += points;
            }

            allSum = sumEven + sumOdd;
        }
        System.out.printf("The project prize was %.2f lv.", allSum * moneyAtPoint);
    }
}
