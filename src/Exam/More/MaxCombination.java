package Exam.More;

import java.util.Scanner;

public class MaxCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int maxCombinations = Integer.parseInt(scanner.nextLine());

        int counterComb = 0;

        for (int i = startNum; i <= endNum; i++) {
            if (counterComb >= maxCombinations) {
                break;
            }
            for (int j = startNum; j <= endNum; j++) {
                System.out.printf("<%d-%d>", i, j);
                counterComb++;
                if (counterComb >= maxCombinations) {
                    break;
                }
            }
        }
    }
}
