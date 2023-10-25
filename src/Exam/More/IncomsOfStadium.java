package Exam.More;

import java.util.Scanner;

public class IncomsOfStadium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfSectors = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        double priceOfTicket = Double.parseDouble(scanner.nextLine());

        double incomsOfsector = (capacity * priceOfTicket) / numOfSectors;
        double allSum = incomsOfsector * numOfSectors;
        double charity = (allSum - (0.75 * incomsOfsector)) / 8;

        System.out.printf("Total income - %.2f BGN%n", allSum);
        System.out.printf("Money for charity - %.2f BGN", charity);
    }
}
