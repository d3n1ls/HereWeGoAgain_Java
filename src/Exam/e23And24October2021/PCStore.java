package Exam.e23And24October2021;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processorPrice = Double.parseDouble(scanner.nextLine());
        double videoCardPrice = Double.parseDouble(scanner.nextLine());
        double pricePerRAM = Double.parseDouble(scanner.nextLine());
        int RAMCount = Integer.parseInt(scanner.nextLine());
        double percentageDiscount = Double.parseDouble(scanner.nextLine());

        double totalPrice = (processorPrice * (1.0 - percentageDiscount)) +
                (videoCardPrice * (1.0 - percentageDiscount)) +
                pricePerRAM * RAMCount;

        totalPrice *= 1.57;

        System.out.printf("Money needed - %.2f leva.", totalPrice);
    }
}
