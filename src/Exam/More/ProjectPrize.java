package Exam.More;

import java.util.Scanner;

public class ProjectPrize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int partsOfProject = Integer.parseInt(scanner.nextLine());
        double moneyPrizeForOneScore = Double.parseDouble(scanner.nextLine());
        double prize = 0;
        int bonusScores = 0;

        for (int i = 1; i <= partsOfProject; i++) {
            int scores = Integer.parseInt(scanner.nextLine());
            if (i%2==0){
                scores = scores*2;
            }
            bonusScores+=scores;
        }
        prize = moneyPrizeForOneScore*bonusScores;
        System.out.printf("The project prize was %.2f lv.", prize);
    }
}
