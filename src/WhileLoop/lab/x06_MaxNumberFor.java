package WhileLoop.lab;

import java.util.Scanner;

public class x06_MaxNumberFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        for (String input = scanner.nextLine(); !input.equals("Stop"); input = scanner.nextLine()) {
            int number = Integer.parseInt(input);
            //проверка дали е макс
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
