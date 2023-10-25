package NestedLoops.exercises;

import java.util.Scanner;

public class x01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int count = 1;
        boolean isEnough = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(count + " ");
                if (count == n) {
                    isEnough = true;
                    break;
                }
                count++;
            }
            if (isEnough) {
                break;
            }
            System.out.println();
        }
    }
}
