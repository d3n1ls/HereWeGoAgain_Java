package Exam.More;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfBitcoins = Integer.parseInt(scanner.nextLine());
        double numOfYuans = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoin = numOfBitcoins*1168;
        double yuan = numOfYuans*0.15*1.76;

        double sum = (bitcoin+yuan)/1.95;
        double totalSum = sum - sum*(commission/100);

        System.out.printf("%.2f",totalSum);

    }
}
