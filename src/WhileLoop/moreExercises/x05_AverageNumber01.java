package WhileLoop.moreExercises;

import java.util.Scanner;

public class x05_AverageNumber01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        double averageNumber = 0;

        for (int i = 0; i < N; i++) {
            averageNumber += Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("%.2f", averageNumber / N);
    }
}
