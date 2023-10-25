package Exam.x26March2016;

import java.text.DecimalFormat;
import java.util.Scanner;

public class x02_PipesInThePool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double p1Fills = p1 * h;
        double p2Fills = p2 * h;
        double fullLitersH = p1Fills + p2Fills;

        double percentFull = 0.0;
        double percentP1 = 0.0;
        double percentP2 = 0.0;
        double overflows = 0.0;

        if (fullLitersH <= v) {
            percentFull = 100 * (fullLitersH / v);
            percentP1 = 100 * (p1Fills / fullLitersH);
            percentP2 = 100 * (p2Fills / fullLitersH);
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.%n",  Math.floor(percentFull),
                    Math.floor(percentP1), Math.floor(percentP2));
        } else {
            DecimalFormat df = new DecimalFormat("0.##");
            overflows = fullLitersH - v;
            System.out.printf("For %s hours the pool overflows with %s liters.%n", df.format(h), overflows);
        }
    }
}
