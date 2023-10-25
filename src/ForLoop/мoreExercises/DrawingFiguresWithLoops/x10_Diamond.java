package ForLoop.мoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class x10_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(scanner.nextLine());

        int left = num / 2;
        int right = left + 1;

        if (num % 2 != 0) {
            left = right;
        }
        int rowsCount = num % 2 == 0 ?
                num - 1 :
                num;

        for (int i = 1; i <= rowsCount; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == left || j == right) {
                    sb.append('*');
                } else {
                    sb.append('-');
                }
            }
            left--;
            right++;

            if (left < 1 && right > num) {
                sb.append(String.format("%n"));
                left += 2;
                right -= 2;
                rowsCount = rowsCount / 2;

                for (int j = 1; j <= rowsCount; j++) {
                    for (int k = 1; k <= num; k++) {
                        if (k == left || k == right) {
                            sb.append('*');
                        } else {
                            sb.append('-');
                        }
                    }
                    left++;
                    right--;
                    sb.append(String.format("%n"));
                }
                break;
            }
            sb.append(String.format("%n"));
        }
        System.out.println(sb);
    }
}
