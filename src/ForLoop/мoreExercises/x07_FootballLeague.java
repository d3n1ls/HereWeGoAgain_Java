package ForLoop.мoreExercises;

import java.util.Scanner;

public class x07_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int totalFans = Integer.parseInt(scanner.nextLine());

        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 0; i < totalFans; i++) {
            char sector = scanner.nextLine().charAt(0);

            switch (sector) {
                case 'A':
                    sectorA++;
                    break;
                case 'B':
                    sectorB++;
                    break;
                case 'V':
                    sectorV++;
                    break;
                case 'G':
                    sectorG++;
                    break;
            }
        }
        System.out.printf("%.2f%%%n", sectorA * 1.0 / totalFans * 100);
        System.out.printf("%.2f%%%n", sectorB * 1.0 / totalFans * 100);
        System.out.printf("%.2f%%%n", sectorV * 1.0 / totalFans * 100);
        System.out.printf("%.2f%%%n", sectorG * 1.0 / totalFans * 100);
        System.out.printf("%.2f%%", totalFans * 1.0 / stadiumCapacity * 100);
    }
}
