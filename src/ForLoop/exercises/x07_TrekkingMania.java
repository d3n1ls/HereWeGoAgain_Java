package ForLoop.exercises;

import java.util.Scanner;

public class x07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupsNumber = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < groupsNumber; i++) {
            int peopleNumber = Integer.parseInt(scanner.nextLine());

            sum += peopleNumber;

            if (peopleNumber <= 5) {
                p1 += peopleNumber;
            } else if (peopleNumber <= 12) {
                p2 += peopleNumber;
            } else if (peopleNumber <= 25) {
                p3 += peopleNumber;
            } else if (peopleNumber <= 40) {
                p4 += peopleNumber;
            } else {
                p5 += peopleNumber;
            }
        }
        System.out.printf("%.2f%%%n", p1 / sum * 100);
        System.out.printf("%.2f%%%n", p2 / sum * 100);
        System.out.printf("%.2f%%%n", p3 / sum * 100);
        System.out.printf("%.2f%%%n", p4 / sum * 100);
        System.out.printf("%.2f%%%n", p5 / sum * 100);
    }
}
