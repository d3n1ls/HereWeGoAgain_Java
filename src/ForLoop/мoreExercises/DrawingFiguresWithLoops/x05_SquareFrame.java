package ForLoop.мoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class x05_SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(scanner.nextLine());

        for (int r = 0; r < num; r++) {
            for (int c = 0; c < num; c++) {
                if ((r == 0 || r == num - 1) &&
                        (c == 0 || c == num - 1)) {
                    sb.append("+ ");
                } else if (c == 0 || c == num - 1) {
                    sb.append("| ");
                } else {
                    sb.append("- ");
                }
            }
            sb.append(String.format("%n"));
        }
        System.out.println(sb);
    }
}
