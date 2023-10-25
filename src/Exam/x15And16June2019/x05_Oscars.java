package Exam.x15And16June2019;

import java.util.Scanner;

public class x05_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judgesCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < judgesCount; i++) {
            String judgeName = scanner.nextLine();
            double pointsFromJudge = Double.parseDouble(scanner.nextLine());

            pointsFromJudge = judgeName.length() * pointsFromJudge / 2;
            academyPoints += pointsFromJudge;

            if (academyPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, academyPoints);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - academyPoints);
    }
}
