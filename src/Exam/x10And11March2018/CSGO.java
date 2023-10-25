package Exam.x10And11March2018;

import java.util.Scanner;

public class CSGO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int itemsToBuy = Integer.parseInt(scanner.nextLine());
        int amountOfMoney = Integer.parseInt(scanner.nextLine());

        int ak47 = 2700;
        int awp = 4750;
        int sg553 = 3500;
        int grenade = 300;
        int flash = 250;
        int glock = 500;
        int bazooka = 5600;

        String weaponName = "";
        int allWeaponsPrice = 0;

        if (itemsToBuy <= 7) {
            for (int i = 0; i < itemsToBuy; i++) {
                weaponName = scanner.nextLine();

                if ("ak47".equals(weaponName)) {
                    allWeaponsPrice += ak47;
                } else if ("awp".equals(weaponName)) {
                    allWeaponsPrice += awp;
                } else if ("sg553".equals(weaponName)) {
                    allWeaponsPrice += sg553;
                } else if ("grenade".equals(weaponName)) {
                    allWeaponsPrice += grenade;
                } else if ("flash".equals(weaponName)) {
                    allWeaponsPrice += flash;
                } else if ("glock".equals(weaponName)) {
                    allWeaponsPrice += glock;
                } else if ("bazooka".equals(weaponName)) {
                    allWeaponsPrice += bazooka;
                }
            }
            if (allWeaponsPrice > amountOfMoney) {
                System.out.printf("Not enough money! You need %d more money.", allWeaponsPrice - amountOfMoney);
            }
            if (allWeaponsPrice <= amountOfMoney) {
                System.out.printf("You bought all %d items! Get to work and defeat the bomb!", itemsToBuy);
            }
        } else {
            System.out.println("Sorry, you can't carry so many things!");
            return;
        }
    }
}
