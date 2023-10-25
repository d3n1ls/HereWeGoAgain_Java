package Exam.e23And24October2021;

import java.util.Scanner;

public class x05_Everest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int goal = 3484;
        int steps = 0;
        int countYes = 0;
        int countAll = 0;


        while (goal >= steps) {
            String input = scanner.nextLine();
            countAll++;
            if (input.equals("END")) {

                break;
            }
            if (input.equals("Yes")) {
                countYes++;
            }

            steps += Integer.parseInt(scanner.nextLine());
        }
        if (steps >= goal) {
            System.out.printf("Goal reached for %d days!", countAll);
        } else if (countYes < 5) {
            System.out.println("Failed!");
            System.out.println(steps + 5364);
        }
    }
}
