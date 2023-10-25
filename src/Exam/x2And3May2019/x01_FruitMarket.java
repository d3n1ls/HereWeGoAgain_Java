package Exam.x2And3May2019;

import java.util.Scanner;

public class x01_FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasAmount = Double.parseDouble(scanner.nextLine());
        double orangesAmount = Double.parseDouble(scanner.nextLine());
        double raspberriesAmount = Double.parseDouble(scanner.nextLine());
        double strawberriesAmount = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice * 0.6;
        double bananasPrice = raspberriesPrice * 0.2;
        double totalPrice = (strawberriesPrice * strawberriesAmount) + (bananasPrice * bananasAmount) +
                (orangesPrice * orangesAmount) + (raspberriesPrice * raspberriesAmount);

        System.out.printf("%.2f", totalPrice);
    }
}
