package Exam.x10And11March2018;

import java.util.Scanner;

public class Illidian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroup = Integer.parseInt(scanner.nextLine());
        double damagePerPlayer = Double.parseDouble(scanner.nextLine());
        int illidanHealth = Integer.parseInt(scanner.nextLine());

        double allDamage = countGroup * damagePerPlayer;

        double diff = Math.abs(illidanHealth - allDamage);
        if (allDamage < illidanHealth) {
            System.out.print("You are not prepared! ");
            System.out.printf("You need %.0f more points.", diff);
        } else {
            System.out.print("Illidan has been slain! ");
            System.out.printf("You defeated him with %.0f points.", diff);
        }
    }
}
