package Exam.x28And29March2020;

import java.util.Scanner;

public class x01_ChangeBureau01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scan.nextLine());
        double uan = Double.parseDouble(scan.nextLine());
        double commission = Double.parseDouble(scan.nextLine());
        double lev = 0;
        double dolar = 0;
        double evro = 0;

        lev = bitcoin * 1168;
        dolar = uan * 0.15;
        evro = (lev + (dolar * 1.76)) / 1.95;
        evro *= (1 - (commission / 100));

        System.out.printf("%.2f", evro);
        scan.close();
    }
}
