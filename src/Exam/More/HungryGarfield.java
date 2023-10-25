package Exam.More;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class HungryGarfield {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal money = new BigDecimal(scanner.nextLine());
        BigDecimal exchangeRate = new BigDecimal(scanner.nextLine());
        BigDecimal pizzaPriceLv = new BigDecimal(scanner.nextLine());
        BigDecimal lasagnaPriceLv = new BigDecimal(scanner.nextLine());
        BigDecimal sandwichPriceLv = new BigDecimal(scanner.nextLine());
        BigDecimal pizzaQuantity = new BigDecimal(scanner.nextLine());
        BigDecimal lasagnaQuantity = new BigDecimal(scanner.nextLine());
        BigDecimal sandwichQuantity = new BigDecimal(scanner.nextLine());

        BigDecimal totalCost = pizzaPriceLv.multiply(pizzaQuantity);
        totalCost = totalCost.add(lasagnaPriceLv.multiply(lasagnaQuantity));
        totalCost = totalCost.add(sandwichPriceLv.multiply(sandwichQuantity));
        totalCost = totalCost.divide(exchangeRate, 2, BigDecimal.ROUND_HALF_UP);

        DecimalFormat df = new DecimalFormat("0.00");
        BigDecimal moneyLeft = money.subtract(totalCost);
        if (moneyLeft.compareTo(BigDecimal.ZERO) >= 0) {
            System.out.printf("Garfield is well fed, John is awesome. Money left: $%s.%n", df.format(moneyLeft));
        } else {
            System.out.printf("Garfield is hungry. John is a badass. Money needed: $%s.%n", df.format(moneyLeft.abs()));
        }
    }
}
