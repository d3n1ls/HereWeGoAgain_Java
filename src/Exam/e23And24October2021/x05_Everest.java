package Exam.e23And24October2021;

import java.util.Scanner;

public class x05_Everest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = 1;
        int meters = 5364;
        boolean goal = false;

        while (true) {
            String text = scan.nextLine();

            if (text.equals("END")) {
                break;
            }

            if (text.equals("Yes")) {
                days++;
            }

            int dayMeters = Integer.parseInt(scan.nextLine());

            if (days > 5) {
                break;
            }

            meters += dayMeters;

            if (meters >= 8848) {
                goal = true;
                break;
            }
        }
        if (goal) {
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.printf("Failed!\n%d", meters);
        }
        scan.close();
    }
}
