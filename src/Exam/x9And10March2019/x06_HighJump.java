package Exam.x9And10March2019;

import java.util.Scanner;

public class x06_HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desiredHeight = Integer.parseInt(scanner.nextLine());

        int currentHeight = desiredHeight - 30;
        int totalJumpsCount = 0;

        while (true) {
            int currAttemptsCount = 0;

            while (true) {
                int currJump = Integer.parseInt(scanner.nextLine());
                currAttemptsCount++;
                totalJumpsCount++;

                if (currJump > currentHeight) {
                    if (currentHeight >= desiredHeight) {
                        System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", currentHeight, totalJumpsCount);
                        return;
                    }

                    currentHeight += 5;
                    break;
                }

                if (currAttemptsCount == 3) {
                    System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, totalJumpsCount);
                    return;
                }
            }
        }
    }
}
