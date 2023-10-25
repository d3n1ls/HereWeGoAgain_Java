package ForLoop.мoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class x04_TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append("$ ");
            }
            sb.append(String.format("%n"));
        }
        System.out.println(sb);
    }
}
