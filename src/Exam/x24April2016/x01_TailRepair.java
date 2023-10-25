package Exam.x24April2016;

import java.util.Scanner;

public class x01_TailRepair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playground = Integer.parseInt(scanner.nextLine());
        double tileW = Double.parseDouble(scanner.nextLine());
        double tileL = Double.parseDouble(scanner.nextLine());
        int benchM = Integer.parseInt(scanner.nextLine());
        int benchO = Integer.parseInt(scanner.nextLine());

        double tileTime = 0.2;

        double playAreaWithout = (playground * playground) - (benchM * benchO);
        double playAreaTile = playAreaWithout / (tileW * tileL);
        double allTime = playAreaTile * (tileTime);

        System.out.printf("%.2f %n%.2f", playAreaTile, allTime);
    }
}
