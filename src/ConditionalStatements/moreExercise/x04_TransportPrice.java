package ConditionalStatements.moreExercise;

import java.util.Scanner;

public class x04_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String dOrN = scanner.nextLine();

        if (n >= 100) {
            double train = 0.06 * n;
            System.out.printf("%.2f", train);
        } else if (n >= 20) {
            double bus = 0.09 * n;
            System.out.printf("%.2f", bus);
        } else {
            if (dOrN.equals("day")) {
                double taxi = 0.70 + (0.79 * n);
                System.out.printf("%.2f", taxi);
            } else {
                double taxi = 0.70 + (0.90 * n);
                System.out.printf("%.2f", taxi);
            }
        }
    }
}
