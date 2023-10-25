package FirstStapsInCoding.moreExercises;

import java.util.Scanner;

public class x07_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double sideWalls = 2 * (x * y - 1.5 * 1.5);
        double otherWalls = (x * x) + (x * x - 1.2 * 2);
        double side = sideWalls + otherWalls;
        double greenPaint = side / 3.4;
        double roof = 2 * (x * y) + 2 * ((x * h / 2));
        double redPaint = roof / 4.3;
        System.out.printf("%.2f %n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }

}
