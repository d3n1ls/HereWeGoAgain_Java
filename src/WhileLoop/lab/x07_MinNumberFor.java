package WhileLoop.lab;

import java.util.Scanner;

public class x07_MinNumberFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        for (String input = scanner.nextLine(); !input.equals("Stop"); input = scanner.nextLine()) {
            int number = Integer.parseInt(input);

            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
}
