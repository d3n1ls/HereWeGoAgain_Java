package NestedLoops.moreExercises;

import java.util.Scanner;

public class x05_ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());

        int tablesTaken = 0;
        boolean allTablesOccupied = false;

        for (int m = 1; m <= men; m++) {
            for (int w = 1; w <= women; w++) {
                System.out.printf("(%d <-> %d) ", m, w);
                tablesTaken++;

                if (tablesTaken == maxTables) {
                    allTablesOccupied = true;
                    break;
                }
            }
            if (allTablesOccupied) {
                break;
            }
        }
    }
}
