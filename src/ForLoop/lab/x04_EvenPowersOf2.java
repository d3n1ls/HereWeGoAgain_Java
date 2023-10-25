package ForLoop.lab;

import java.util.Scanner;

public class x04_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int step = 0; step <= n; step += 2) {
            System.out.printf("%.0f%n", Math.pow(2, step));
        }
    }
}
