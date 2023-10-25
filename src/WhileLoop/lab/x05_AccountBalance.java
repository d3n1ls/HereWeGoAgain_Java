package WhileLoop.lab;

import java.util.Scanner;

public class x05_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        String input = scanner.nextLine();

        while (!input.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(input);
            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", sum);
            total += sum;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", total);
    }
}
