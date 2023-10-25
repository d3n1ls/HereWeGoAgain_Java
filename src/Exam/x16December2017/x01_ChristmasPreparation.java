package Exam.x16December2017;

import java.util.Scanner;

public class x01_ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wrappingPaper = Integer.parseInt(scanner.nextLine());
        int rollsCloth = Integer.parseInt(scanner.nextLine());
        double glueLiters = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double pricePaper = wrappingPaper * 5.80;
        double priceCloth = rollsCloth * 7.20;
        double priceGlue = glueLiters * 1.20;

        double allPrice = pricePaper + priceCloth + priceGlue;
        double pricePlusDiscount = allPrice - (allPrice * (percentDiscount / 100.0));

        System.out.printf("%.3f", pricePlusDiscount);
    }
}
