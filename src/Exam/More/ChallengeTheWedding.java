package Exam.More;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int men = Integer.parseInt(scan.nextLine());
        int women = Integer.parseInt(scan.nextLine());
        int tables = Integer.parseInt(scan.nextLine());

        int count = 0;

        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                System.out.printf("(%d <-> %d) ", i,j);
                count++;
                if (count >= tables) {
                    return;
                }
            }
        }
    }
}
