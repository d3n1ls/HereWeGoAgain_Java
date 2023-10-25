package FirstStapsInCoding.exercises;

import java.util.Scanner;

public class x09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeInCm = length * width * height;
        double volumeInLitres = volumeInCm * 0.001;
        volumeInLitres = volumeInLitres - volumeInLitres * (percent / 100);

        System.out.println(volumeInLitres);
    }
}
