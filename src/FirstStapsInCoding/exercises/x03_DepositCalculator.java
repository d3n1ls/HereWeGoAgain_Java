package FirstStapsInCoding.exercises;

import java.util.Scanner;

public class x03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());
        double interestPerMonth = depositSum * (interestRate / 100) / 12;
        double totalSum = depositSum + months * interestPerMonth;
        System.out.println(totalSum);
    }
}
