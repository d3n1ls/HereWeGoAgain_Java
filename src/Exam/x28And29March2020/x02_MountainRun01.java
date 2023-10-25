package Exam.x28And29March2020;

import java.util.Scanner;

public class x02_MountainRun01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double timeMether = Double.parseDouble(scan.nextLine());
        double time = 0;

        time = (distance * timeMether) + (Math.floor(distance / 50)* 30);

        if (time < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", time);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", (time - record));
        }
        scan.close();
    }
}
