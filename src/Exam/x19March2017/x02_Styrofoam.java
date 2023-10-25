package Exam.x19March2017;

import java.util.Scanner;

public class x02_Styrofoam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double houseArea = Double.parseDouble(scanner.nextLine());
        int countWindows = Integer.parseInt(scanner.nextLine());
        double sqmStyrofoamPack = Double.parseDouble(scanner.nextLine());
        double priceStyrofoamPack = Double.parseDouble(scanner.nextLine());

        double houseArWin = houseArea - (countWindows * 2.4);
        double allHouseArea = houseArWin + (houseArWin * 0.10);

        double priceAllPack = (Math.ceil(allHouseArea / sqmStyrofoamPack)) * priceStyrofoamPack;

        double diff = Math.abs(budget - priceAllPack);

        if (budget >= priceAllPack) {
            System.out.printf("Spent: %.2f%nLeft: %.2f", priceAllPack, diff);
        } else {
            System.out.printf("Need more: %.2f", diff);
        }
    }
}
