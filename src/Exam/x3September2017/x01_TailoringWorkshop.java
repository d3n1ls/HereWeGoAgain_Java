package Exam.x3September2017;

import java.util.Scanner;

public class x01_TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTable = Integer.parseInt(scanner.nextLine());
        double tableLength = Double.parseDouble(scanner.nextLine());
        double tableWidth = Double.parseDouble(scanner.nextLine());

        double allAreaCover = countTable * (tableLength + 2 * 0.3) * (tableWidth + 2 * 0.3);
        double allAreaSquare = countTable * (tableLength / 2) * (tableLength / 2);
        double priceUsd = (allAreaCover * 7) + (allAreaSquare * 9);
        double priceLv = priceUsd * 1.85;

        System.out.printf("%.2f USD %n%.2f BGN", priceUsd, priceLv);
    }
}
