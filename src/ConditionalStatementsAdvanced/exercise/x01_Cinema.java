package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class x01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colons = Integer.parseInt(scanner.nextLine());

        double income = 0.0;
        if ("Premiere".equals(projection)) {
            income = rows * colons * 12;
        } else if ("Normal".equals(projection)) {
            income = rows * colons * 7.50;
        } else if ("Discount".equals(projection)) {
            income = rows * colons * 5;
        }
        System.out.printf("%.2f leva", income);
    }
}


