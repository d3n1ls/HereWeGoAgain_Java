package Exam.More;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PassionDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal money = new BigDecimal(scanner.nextLine());

        String inputLine;
        int purchases = 0;

        do {
            inputLine = scanner.nextLine();
        } while (!"mall.Enter".equals(inputLine));

        while (true) {
            inputLine = scanner.nextLine();

            if ("mall.Exit".equals(inputLine)) {
                break;
            }

            for (int i = 0; i < inputLine.length(); i++) {
                char nextChar = inputLine.charAt(i);
                double moneyChange = 0d;
                if (nextChar >= 'a' && nextChar <= 'z') {
                    moneyChange = 0.3d * nextChar;
                } else if (nextChar >= 'A' && nextChar <= 'Z') {
                    moneyChange = 0.5d * nextChar;
                } else if (nextChar == '*') {
                    money = money.add(new BigDecimal("10"));
                } else if (nextChar == '%') {
                    if (money.compareTo(BigDecimal.ZERO) > 0) {
                        money = money.multiply(new BigDecimal("0.5"));
                        purchases++;
                    }
                } else {
                    moneyChange = (double) nextChar;
                }

                if (moneyChange > 0d && money.compareTo(BigDecimal.valueOf(moneyChange)) >= 0) {
                    money = money.subtract(BigDecimal.valueOf(moneyChange));
                    purchases++;
                }
            }
        }

        DecimalFormat df = new DecimalFormat("0.00");

        if (purchases == 0) {
            System.out.printf("No purchases. Money left: %s lv.%n", df.format(money));
        } else {
            System.out.printf("%d purchases. Money left: %s lv.%n", purchases, df.format(money));
        }
    }
}
