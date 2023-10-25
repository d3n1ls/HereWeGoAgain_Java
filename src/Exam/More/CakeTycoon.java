package Exam.More;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CakeTycoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal cakes = new BigDecimal(scanner.nextLine());
        BigDecimal flourForOneCake = new BigDecimal(scanner.nextLine());
        BigDecimal flourAvailable = new BigDecimal(scanner.nextLine());
        BigDecimal trufflesAvailable = new BigDecimal(scanner.nextLine());
        BigDecimal priceForOneTruffles = new BigDecimal(scanner.nextLine());

        BigDecimal flourNeeded = flourForOneCake.multiply(cakes);

        DecimalFormat df = new DecimalFormat("0.00");
        if (flourAvailable.compareTo(flourNeeded) < 0) {
            cakes = flourAvailable.divide(flourForOneCake, 0, BigDecimal.ROUND_FLOOR);
            System.out.printf("Can make only %s cakes, need %s kg more flour%n",
                    cakes.toString(), df.format(flourNeeded.subtract(flourAvailable).doubleValue()));
        } else {
            BigDecimal costForOneCake = trufflesAvailable.multiply(priceForOneTruffles)
                    .multiply(new BigDecimal("1.25")).divide(cakes, 2, BigDecimal.ROUND_HALF_UP);

            System.out.printf("All products available, price of a cake: %s%n",
                    df.format(costForOneCake.doubleValue()));
        }
    }
}
