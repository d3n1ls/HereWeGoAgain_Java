package Exam.x20November2016;

import java.util.Scanner;

public class x02_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMagnolia = Integer.parseInt(scanner.nextLine());
        int countHyacinth = Integer.parseInt(scanner.nextLine());
        int countRose = Integer.parseInt(scanner.nextLine());
        int countCactus = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());

        double sumFlowersLv = (countMagnolia * 3.25) + (countHyacinth * 4) + (countRose * 3.5) + (countCactus * 8);
        double minusTax = sumFlowersLv - (sumFlowersLv * 0.05);

        double left = 0.0;
        double need = 0.0;

        if (minusTax >= priceGift) {
            left = minusTax - priceGift;
            System.out.printf("She is left with %.0f leva.", Math.floor(left));
        } else {
            need = priceGift - minusTax;
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(need));
        }
    }
}
