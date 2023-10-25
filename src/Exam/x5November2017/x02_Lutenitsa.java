package Exam.x5November2017;

import java.util.Scanner;

public class x02_Lutenitsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kgTomato = Double.parseDouble(scanner.nextLine());
        int countBoxTruck = Integer.parseInt(scanner.nextLine());
        int countJar = Integer.parseInt(scanner.nextLine());

        double allKgLutenica = kgTomato / 5.0;
        double lutenicaJars = allKgLutenica / 0.535;
        double allBoxes = lutenicaJars / countJar;

        System.out.printf("Total lutenica: %.0f kilograms.%n", Math.floor(allKgLutenica));

        double diffBox = Math.abs(allBoxes - countBoxTruck);
        double allJars = countJar * countBoxTruck;
        double diffJar = Math.abs(allJars * 1.0 - lutenicaJars);
        if (allBoxes >= countBoxTruck) {
            System.out.printf("%.0f boxes left.%n", Math.floor(diffBox));
            System.out.printf("%.0f jars left.", Math.floor(diffJar));
        } else if (allBoxes < countBoxTruck) {
            System.out.printf("%.0f more boxes needed.%n", Math.floor(diffBox));
            System.out.printf("%.0f more jars needed.", Math.floor(diffJar));
        }
    }
}
