package WhileLoop.exercises;

import java.util.Scanner;

public class x05_Coins1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = scanner.nextDouble() * 100.0;
        int coinCount = 0;

        while (change > 0) {
            if (change >= 200) {
                coinCount += change / 200.0;
                change %= 200.0;
            } else if (change >= 100) {
                coinCount += change / 100.0;
                change %= 100.0;
            } else if (change >= 50) {
                coinCount += change / 50.0;
                change %= 50.0;
            } else if (change >= 20) {
                coinCount += change / 20.0;
                change %= 20.0;
            } else if (change >= 10) {
                coinCount += change / 10.0;
                change %= 10;
            } else if (change >= 5) {
                coinCount += change / 5.0;
                change %= 5.0;
            } else if (change >= 2) {
                coinCount += change / 2.0;
                change %= 2;
            } else if (change >= 1.0) {
                coinCount += 1;
                change = 0;
            } else {
                break;
            }
        }
        System.out.println(coinCount);
    }
}
