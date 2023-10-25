package NestedLoops.moreExercises;

import java.util.Scanner;

public class x04_CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <= endNum; j++) {
                for (int k = startNum; k <= endNum; k++) {
                    for (int l = startNum; l <= endNum; l++) {
                        if ((i > l) && ((j + k) % 2 == 0) &&
                                ((i % 2 == 0 && l % 2 != 0) ||
                                        (i % 2 != 0 && l % 2 == 0))) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
