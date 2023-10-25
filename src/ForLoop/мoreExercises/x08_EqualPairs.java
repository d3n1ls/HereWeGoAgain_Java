package ForLoop.мoreExercises;

import java.util.Scanner;

public class x08_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pairsCount = Integer.parseInt(scanner.nextLine());

        int prevValue = Integer.MIN_VALUE;
        int prevDiff = Integer.MIN_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        boolean areEqual = true;

        for (int i = 0; i < pairsCount; i++) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());

            int value = firstNum + secondNum;

            if (i > 0) {
                if (value != prevValue) {
                    int diff = Math.abs(value - prevValue);
                    areEqual = false;

                    if (diff > maxDiff) {
                        maxDiff = diff;
                    }
                    prevDiff = diff;
                }
            }
            prevValue = value;
        }
        if (areEqual) {
            System.out.printf("Yes, value=%d", prevValue);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
