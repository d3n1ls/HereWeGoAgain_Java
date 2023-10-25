package WhileLoop.lab;

import java.util.Scanner;

public class x04_Sequence2kPlus1For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number = number * 2 + 1) {
            System.out.println(number);
        }
    }
}
