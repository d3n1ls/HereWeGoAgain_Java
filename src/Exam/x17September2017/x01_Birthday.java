package Exam.x17September2017;

import java.util.Scanner;

public class x01_Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeAqua = (length * width * height) * 0.001;
        double minusAcc = volumeAqua - (volumeAqua * (percent * 0.01));

        System.out.printf("%.3f", minusAcc);
    }
}
