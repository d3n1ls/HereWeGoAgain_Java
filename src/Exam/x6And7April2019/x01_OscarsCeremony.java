package Exam.x6And7April2019;

import java.util.Scanner;

public class x01_OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallPrice = Integer.parseInt(scanner.nextLine());

        double statuesPrice = hallPrice * 0.7;
        double cateringPrice = statuesPrice * 0.85;
        double soundPrice = cateringPrice / 2;
        double totalPrice = hallPrice + statuesPrice + cateringPrice + soundPrice;

        System.out.printf("%.2f", totalPrice);
    }
}
