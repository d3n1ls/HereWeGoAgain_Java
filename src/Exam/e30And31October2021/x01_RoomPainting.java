package Exam.e30And31October2021;

import java.util.Scanner;

public class x01_RoomPainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBoxPaint = Integer.parseInt(scanner.nextLine());
        int countRoll = Integer.parseInt(scanner.nextLine());
        double priceGloves = Double.parseDouble(scanner.nextLine());
        double priceBrush = Double.parseDouble(scanner.nextLine());

        int countGloves = (int) Math.ceil(countRoll * 0.35);
        int countBrush = (int) Math.floor(countBoxPaint * 0.48);

        double totalPrice = countBoxPaint * 21.50 + countRoll * 5.20 + countGloves * priceGloves + countBrush * priceBrush;

        double delivery = totalPrice * 1 / 15;
        System.out.printf("This delivery will cost %.2f lv.", delivery);
    }
}
