package FirstStapsInCoding.moreExercises;

import java.util.Scanner;

public class x05_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        int deskInRow = (int) ((h * 100 - 100) / 70);
        int row = (int) (w * 100) / 120;
        int total = deskInRow * row - 3;
        System.out.println(total);
    }
}
