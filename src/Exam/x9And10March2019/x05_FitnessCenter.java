package Exam.x9And10March2019;

import java.util.Scanner;

public class x05_FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitorsCount = Integer.parseInt(scanner.nextLine());

        int backCount = 0;
        int chestCount = 0;
        int legsCount = 0;
        int absCount = 0;
        int proteinShakeCount = 0;
        int proteinBarCount = 0;
        int trainingCount = 0;
        int shoppingCount = 0;

        for (int i = 0; i < visitorsCount; i++) {
            String action = scanner.nextLine();

            switch (action) {
                case "Back":
                    backCount++;
                    trainingCount++;
                    break;
                case "Chest":
                    chestCount++;
                    trainingCount++;
                    break;
                case "Legs":
                    legsCount++;
                    trainingCount++;
                    break;
                case "Abs":
                    absCount++;
                    trainingCount++;
                    break;
                case "Protein shake":
                    proteinShakeCount++;
                    shoppingCount++;
                    break;
                case "Protein bar":
                    proteinBarCount++;
                    shoppingCount++;
                    break;
            }
        }

        System.out.printf("%d - back%n", backCount);
        System.out.printf("%d - chest%n", chestCount);
        System.out.printf("%d - legs%n", legsCount);
        System.out.printf("%d - abs%n", absCount);
        System.out.printf("%d - protein shake%n", proteinShakeCount);
        System.out.printf("%d - protein bar%n", proteinBarCount);
        System.out.printf("%.2f%% - work out%n", (trainingCount * 1.0 / visitorsCount * 100));
        System.out.printf("%.2f%% - protein", (shoppingCount * 1.0 / visitorsCount * 100));
    }
}
