package Exam.x22And23August2020;

import java.util.Scanner;

public class Illidan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numPlayers = Integer.parseInt(scan.nextLine());
        int strenghtPlayer = Integer.parseInt(scan.nextLine());
        int healthIllidan = Integer.parseInt(scan.nextLine());

        int totalStrenght = strenghtPlayer * numPlayers;

        if (totalStrenght >= healthIllidan) {
            System.out.printf("Illidan has been slain! You defeated him with %d points.", (totalStrenght - healthIllidan));
        } else {
            System.out.printf("You are not prepared! You need %d more points.", (healthIllidan - totalStrenght));
        }
        scan.close();
    }
}
