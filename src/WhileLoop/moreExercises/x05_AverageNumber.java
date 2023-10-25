package WhileLoop.moreExercises;

import java.util.Scanner;

public class x05_AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int countN = 0;
        double sum = 0;

        while (countN < n) {
            double ns = Double.parseDouble(scanner.nextLine());
            sum += ns;
            countN++;
        }
        System.out.printf("%.2f", sum / n);
    }
}
