package ForLoop.exercises;

import java.util.Scanner;

public class x04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double laundry = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;
        int money = 10;
        int toysCount = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sum += money;
                money += 10;
                sum -= 1;
            } else {
                toysCount++;
            }
        }
        sum += toyPrice * toysCount;

        if (sum >= laundry) {
            System.out.printf("Yes! %.2f", sum - laundry);
        } else {
            System.out.printf("No! %.2f", laundry - sum);
        }
    }
}
