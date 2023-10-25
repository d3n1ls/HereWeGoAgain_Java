package ForLoop.lab;

import java.util.Scanner;

public class x07_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int number = 1; number <= countNumbers; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;
        }
        System.out.println(sum);
    }
}
