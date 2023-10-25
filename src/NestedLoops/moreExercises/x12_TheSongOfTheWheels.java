package NestedLoops.moreExercises;

import java.util.Scanner;

public class x12_TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        String key = "";
        boolean isFound = false;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if ((i * j + k * l == M) && (i < j) && (k > l)) {
                            counter++;

                            if (counter == 4) {
                                key = String.format("%d%d%d%d", i, j, k, l);
                            }
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
        System.out.println();

        if (!key.equals("")) {
            System.out.println("Password: " + key);
        } else {
            System.out.println("No!");
        }
    }
}
