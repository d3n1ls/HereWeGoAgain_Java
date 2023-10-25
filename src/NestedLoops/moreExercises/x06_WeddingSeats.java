package NestedLoops.moreExercises;

import java.util.Scanner;

public class x06_WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int rowsCount = Integer.parseInt(scanner.nextLine());
        int spacesInOddRow = Integer.parseInt(scanner.nextLine());

        int totalSpacesCount = 0;

        for (int s = 'A'; s <= lastSector; s++) {
            for (int r = 1; r <= rowsCount; r++) {
                int spacesInCurrRow = r % 2 == 0 ? spacesInOddRow + 2 : spacesInOddRow;

                for (int i = 0; i < spacesInCurrRow; i++) {
                    System.out.printf("%c%d%c%n", (char) s, r, (char) (97 + i));
                    totalSpacesCount++;
                }
            }
            rowsCount++;
        }
        System.out.println(totalSpacesCount);
    }
}
