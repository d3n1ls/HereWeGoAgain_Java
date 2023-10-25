package Exam.More;

import java.util.Scanner;

public class CountryFlagsCapsPostersStickers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String typeSouvenirs = scanner.nextLine();
        int souvenirs = Integer.parseInt(scanner.nextLine());
        double price = 0;
        boolean isInvalid = false;
        boolean invalid = false;

        switch (country) {
            case "Argentina":
                if (typeSouvenirs.equals("flags")) {
                    price = 3.25 * souvenirs;
                } else if (typeSouvenirs.equals("caps")) {
                    price = 7.20 * souvenirs;
                } else if (typeSouvenirs.equals("posters")) {
                    price = 5.10 * souvenirs;
                } else if (typeSouvenirs.equals("stickers")) {
                    price = 1.25 * souvenirs;
                } else {
                    isInvalid = true;
                }
                break;
            case "Brazil":
                if (typeSouvenirs.equals("flags")) {
                    price = 4.20 * souvenirs;
                } else if (typeSouvenirs.equals("caps")) {
                    price = 8.50 * souvenirs;
                } else if (typeSouvenirs.equals("posters")) {
                    price = 5.35 * souvenirs;

                } else if (typeSouvenirs.equals("stickers")) {
                    price = 1.2 * souvenirs;

                } else {
                    isInvalid = true;
                }
                break;
            case "Croatia":
                if (typeSouvenirs.equals("flags")) {
                    price = 2.75 * souvenirs;
                } else if (typeSouvenirs.equals("caps")) {
                    price = 6.90 * souvenirs;
                } else if (typeSouvenirs.equals("posters")) {
                    price = 4.95 * souvenirs;
                } else if (typeSouvenirs.equals("stickers")) {
                    price = 1.1 * souvenirs;
                } else {
                    isInvalid = true;
                }
                break;
            case "Denmark":
                if (typeSouvenirs.equals("flags")) {
                    price = 3.10 * souvenirs;
                } else if (typeSouvenirs.equals("caps")) {
                    price = 6.50 * souvenirs;
                } else if (typeSouvenirs.equals("posters")) {
                    price = 4.80 * souvenirs;
                } else if (typeSouvenirs.equals("stickers")) {
                    price = 0.90 * souvenirs;
                } else {
                    isInvalid = true;
                }
                break;
            default:
                invalid = true;
                break;
        }
        if (isInvalid) {
            System.out.printf("Invalid stock!");
        } else if (invalid) {
            System.out.printf("Invalid country!");
        } else {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirs, typeSouvenirs, country, price);
        }
    }
}
