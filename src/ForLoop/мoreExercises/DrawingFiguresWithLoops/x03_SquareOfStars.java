package ForLoop.мoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class x03_SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append("* ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
