package ForLoop.мoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class x08_Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(scanner.nextLine());

        for (int r = 0; r < num; r++) {
            for (int c = 0; c < num * 5; c++) {
                if (r == 0 || r == num - 1) {
                    if (c < num * 2 || c >= num * 3) {
                        sb.append('*');
                    } else {
                        sb.append(' ');
                    }
                } else {
                    if ((c == 0) || (c == num * 2 - 1) || (c == num * 3) || (c == num * 5 - 1)) {
                        sb.append('*');
                    } else if ((c > 0 && c < num * 2 - 1) || (c >= num * 3 + 1 && c < num * 5 - 1)) {
                        sb.append('/');
                    } else {
                        if ((num % 2 == 0) && (r == num / 2 - 1)) {
                            sb.append('|');
                        } else if ((num % 2 != 0) && (r == num / 2)) {
                            sb.append('|');
                        } else {
                            sb.append(' ');
                        }
                    }
                }
            }
            sb.append(String.format("%n"));
        }
        System.out.println(sb);
    }
}
