package Exam.x18December2016;

import java.util.Scanner;

public class x02_ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double haveMoney = Double.parseDouble(scanner.nextLine());
        double floorWidth = Double.parseDouble(scanner.nextLine());
        double floorLength = Double.parseDouble(scanner.nextLine());
        double triangleA = Double.parseDouble(scanner.nextLine());
        double triangleHa = Double.parseDouble(scanner.nextLine());
        double priceTile = Double.parseDouble(scanner.nextLine());
        double workPrice = Double.parseDouble(scanner.nextLine());

        double floorArea = floorLength * floorWidth;
        double tileArea = triangleA * triangleHa / 2;
        double countTile = Math.ceil(floorArea / tileArea) + 5;
        double priceAllTiles = countTile * priceTile;
        double needMoney = priceAllTiles + workPrice;

        double left = 0.0;
        double need = 0.0;

        if (needMoney <= haveMoney) {
            left = haveMoney - needMoney;
            System.out.printf("%.2f lv left.", left);
        } else {
            need = needMoney - haveMoney;
            System.out.printf("You'll need %.2f lv more.", need);
        }
    }
}
