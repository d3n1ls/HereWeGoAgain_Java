package Exam.x28And29March2020;

import java.util.Scanner;

public class x02_CatWalking01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = Integer.parseInt(scan.nextLine());
        int num = Integer.parseInt(scan.nextLine());
        int calEat = Integer.parseInt(scan.nextLine());
        int cal = 0;

        min *= num;
        cal = min * 5;
        calEat /= 2;

        if (cal >= calEat) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", cal);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", cal);
        }
        scan.close();
    }
}
