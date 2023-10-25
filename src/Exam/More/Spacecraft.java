package Exam.More;

import java.util.Scanner;

public class Spacecraft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double averageHeightAstro = Double.parseDouble(scan.nextLine());

        double shipVolume = width * length * height;
        double roomVolume = (averageHeightAstro + 0.40) * 2 * 2;

        double astrounafts = Math.floor(shipVolume / (roomVolume * 1.0));

        if (astrounafts < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (astrounafts >= 3 && astrounafts <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", astrounafts);
        } else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
