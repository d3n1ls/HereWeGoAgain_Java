package ConditionalStatements.moreExercise;

import java.util.Scanner;

public class x01_PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = Double.parseDouble(scanner.nextLine());
        double p1 = Double.parseDouble(scanner.nextLine());
        double p2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double momentV = (p1 + p2) * h;
        double momentp1perc = ((p1 * h) / momentV) * 100;
        double momentp2perc = ((p2 * h) / momentV) * 100;
        double momentVperc = (momentV / v) * 100;
        if (momentV <= v) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", momentVperc, momentp1perc, momentp2perc);
        } else {
            double overflow = Math.abs(momentV - v);
            System.out.printf("For %.2f hours the pool overflow with %.2f liters.", h, overflow);
        }
    }
}
