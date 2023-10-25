package FirstStapsInCoding.exercises;

import java.util.Scanner;

public class x07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());
        double priceChickenMenu = chickenMenu * 10.35;
        double priceFishMenu = fishMenu * 12.40;
        double priceVeganMenu = veganMenu * 8.15;
        double price = priceChickenMenu + priceFishMenu + priceVeganMenu;
        double priceDessert = price * 0.20;
        double priceDelivery = 2.50;
        double total = price + priceDessert + priceDelivery;
        System.out.println(total);
    }
}
