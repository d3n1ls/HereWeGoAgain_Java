package Exam.More;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenirs = scanner.nextLine();
        int numOfboughtSouv = Integer.parseInt(scanner.nextLine());
        double price = 0;
        boolean isCorrect = true;

        if (team.equalsIgnoreCase("Argentina")) {
            if (souvenirs.equalsIgnoreCase("flags")) {
                price = 3.25;
            } else if (souvenirs.equalsIgnoreCase("caps")) {
                price = 7.20;
            } else if (souvenirs.equalsIgnoreCase("posters")) {
                price = 5.10;
            } else if (souvenirs.equalsIgnoreCase("stickers")) {
                price = 1.25;
            } else {
                System.out.println("Invalid stock!");
                isCorrect = false;
            }
        } else if (team.equalsIgnoreCase("Brazil")) {
            if (souvenirs.equalsIgnoreCase("flags")) {
                price = 4.20;
            } else if (souvenirs.equalsIgnoreCase("caps")) {
                price = 8.50;
            } else if (souvenirs.equalsIgnoreCase("posters")) {
                price = 5.35;
            } else if (souvenirs.equalsIgnoreCase("stickers")) {
                price = 1.20;
            } else {
                System.out.println("Invalid stock!");
                isCorrect = false;
            }
        } else if (team.equalsIgnoreCase("Croatia")) {
            if (souvenirs.equalsIgnoreCase("flags")) {
                price = 2.75;
            } else if (souvenirs.equalsIgnoreCase("caps")) {
                price = 6.90;
            } else if (souvenirs.equalsIgnoreCase("posters")) {
                price = 4.95;
            } else if (souvenirs.equalsIgnoreCase("stickers")) {
                price = 1.10;
            } else {
                System.out.println("Invalid stock!");
                isCorrect = false;
            }
        } else if (team.equalsIgnoreCase("Denmark")) {
            if (souvenirs.equalsIgnoreCase("flags")) {
                price = 3.10;
            } else if (souvenirs.equalsIgnoreCase("caps")) {
                price = 6.50;
            } else if (souvenirs.equalsIgnoreCase("posters")) {
                price = 4.80;
            } else if (souvenirs.equalsIgnoreCase("stickers")) {
                price = 0.90;
            } else {
                System.out.println("Invalid stock!");
                isCorrect = false;
            }
        } else {
            System.out.println("Invalid country!");
            isCorrect = false;
        }

        double sum = price * numOfboughtSouv;
        if (isCorrect) {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numOfboughtSouv, souvenirs, team, sum);
        }
    }
}
