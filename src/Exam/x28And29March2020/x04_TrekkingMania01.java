package Exam.x28And29March2020;

import java.util.Scanner;

public class x04_TrekkingMania01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grups = Integer.parseInt(scan.nextLine());
        double musala = 0;
        double monblan  = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;
        int total = 0;

        while (grups > 0) {
            int num = Integer.parseInt(scan.nextLine());

            if (num <= 5) {
                musala += num;
            }else if ((6 <= num) && (num <= 12)) {
                monblan += num;
            }else if ((13 <= num) && (num <= 25)) {
                kilimanjaro += num;
            }else if ((26 <= num) && (num <= 40)) {
                k2 += num;
            }else if (41 <= num) {
                everest += num;
            }
            total += num;
            grups--;
        }
        System.out.printf("%.2f%%\n", (musala / total)*100);
        System.out.printf("%.2f%%\n", (monblan / total)*100);
        System.out.printf("%.2f%%\n", (kilimanjaro / total)*100);
        System.out.printf("%.2f%%\n", (k2 / total)*100);
        System.out.printf("%.2f%%\n", (everest / total)*100);
        scan.close();
    }
}
