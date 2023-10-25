package Exam.More;

import java.util.Scanner;

public class WeddingHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double hallLength = Double.parseDouble(scan.nextLine());
        double hallWidth = Double.parseDouble(scan.nextLine());
        double barSide = Double.parseDouble(scan.nextLine());

        double hallSize = hallLength * hallWidth;
        double barSize = barSide * barSide;
        double dancingSize = hallSize * 0.19;
        double freeSpace = hallSize - barSize - dancingSize;
        double guests = (freeSpace * 1.0) / 3.2;

        System.out.printf("%.0f", Math.ceil(guests));
    }
}
