package Exam.x28August2016;

import java.util.Scanner;

public class x01_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workDays = Integer.parseInt(scanner.nextLine());
        double profAtDayUsd = Double.parseDouble(scanner.nextLine());
        double rateUsd = Double.parseDouble(scanner.nextLine());

        double mSalary = workDays * profAtDayUsd;
        double bonus = mSalary * 2.5;
        double yearSalary = mSalary * 12;
        double yearSalBonus = yearSalary + bonus;
        double salaryNetUsd = yearSalBonus - (yearSalBonus * (25 / 100.0));
        double salaryNetBgn = salaryNetUsd * rateUsd;
        double bgnAtDay = salaryNetBgn / 365.0;

        System.out.printf("%.2f", bgnAtDay);
    }
}
