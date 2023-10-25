package ConditionalStatements.moreExercise;

import java.util.Scanner;

public class x07_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = magnolias * 3.25 + hyacinths * 4 + roses * 3.5 + cacti * 8;
        double profit = totalPrice - (totalPrice * 0.05);
        double marge = Math.abs(profit - giftPrice);
        if (profit >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(marge));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(marge));
        }
    }
}
