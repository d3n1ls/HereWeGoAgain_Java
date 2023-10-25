package ForLoop.мoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class x06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                sb.append(' ');
            }
            for (int j = 1; j <= i; j++) {
                sb.append("* ");
            }
            sb.append(String.format("%n"));
        }
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 0; j < num - i; j++) {
                sb.append(' ');
            }
            for (int j = 1; j <= i; j++) {
                sb.append("* ");
            }
            sb.append(String.format("%n"));
        }
        System.out.println(sb);
    }
}
