package Exam.x6March2016;

import java.util.Scanner;

public class x04_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double under200 = 0;
        double between200And399 = 0;
        double between400And599 = 0;
        double between600And799 = 0;
        double over800 = 0;

        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(scanner.nextLine());

            if (current < 200) {
                under200++;
            } else if (current <= 399) {
                between200And399++;
            } else if (current <= 599) {
                between400And599++;
            } else if (current <= 799) {
                between600And799++;
            } else if (current <= 1000) {
                over800++;
            }
        }
        System.out.printf("%.2f%%%n", under200 / n * 100);
        System.out.printf("%.2f%%%n", between200And399 / n * 100);
        System.out.printf("%.2f%%%n", between400And599 / n * 100);
        System.out.printf("%.2f%%%n", between600And799 / n * 100);
        System.out.printf("%.2f%%%n", over800 / n * 100);
    }
}
