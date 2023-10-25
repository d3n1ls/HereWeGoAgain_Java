package Exam.x9And10March2019;

import java.util.Scanner;

public class x01_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyTax = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = yearlyTax * 0.6;
        double equipmentPrice = sneakersPrice * 0.8;
        double ballPrice = equipmentPrice / 4;
        double accessoriesPrice = ballPrice / 5;
        double totalPrice = yearlyTax + sneakersPrice + equipmentPrice
                + ballPrice + accessoriesPrice;

        System.out.println(String.format("%.2f", totalPrice));
    }
}
