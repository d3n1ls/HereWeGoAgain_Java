package ForLoop.мoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class x09_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(scanner.nextLine());

        int left = num / 2;
        int right = left + 1;

        if (num % 2 != 0) {
            left = right;
        }
        for (int i = 1; i <= num; i++) {
            if (left >= 1 && right <= num) {
                for (int c = 1; c <= num; c++) {
                    if (c >= left && c <= right) {
                        sb.append('*');
                    } else {
                        sb.append('-');
                    }
                }
                left--;
                right++;
            } else {
                sb.append('|');

                for (int j = 0; j < num - 2; j++) {
                    sb.append('*');
                }
                sb.append('|');
            }
            sb.append(String.format("%n"));
        }
        System.out.println(sb);
    }
}
