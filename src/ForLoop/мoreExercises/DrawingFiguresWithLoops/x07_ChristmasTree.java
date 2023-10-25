package ForLoop.мoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class x07_ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            sb.append(' ');
        }
        sb.append(String.format(" |%n"));

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                sb.append(' ');
            }
            for (int j = 0; j <= i; j++) {
                sb.append('*');
            }
            sb.append(String.format(" | "));

            for (int j = 0; j <= i; j++) {
                sb.append('*');
            }
            sb.append(String.format("%n"));
        }
        System.out.println(sb);
    }
}
