package Exam.x28And29March2020;

import java.util.Scanner;

public class x05_SuitcasesLoad01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double space = Double.parseDouble(scan.nextLine());
        String suitcase = scan.nextLine();
        int suitcaseNum = 0;
        int count = 1;
        boolean loaded = true;

        while (!suitcase.equals("End")) {
            double volume = Double.parseDouble(suitcase);
            if (count == 3) {
                volume *= (1 + 0.1);
                count = 0;
            }
            space -= volume;
            if (space < 0) {
                loaded = false;
                break;
            }else {
                suitcaseNum++;
            }
            suitcase = scan.nextLine();
            count++;
        }
        if (loaded) {
            System.out.println("Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", suitcaseNum);
        scan.close();
    }
}
