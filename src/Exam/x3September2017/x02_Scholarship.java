package Exam.x3September2017;

import java.util.Scanner;

public class x02_Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double incomeLv = Double.parseDouble(scanner.nextLine());
        double avGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double social = 0.0;
        double grade = 0.0;

        if (incomeLv <= minSalary && avGrade > 4.50) {
            social = minSalary * 0.35;
        }
        if (incomeLv <= minSalary && avGrade > 4.50 && avGrade < 5.50) {
            social = minSalary * 0.35;
        }
        if (avGrade >= 5.50) {
            grade = avGrade * 25;
        }

        if (social > grade) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(social));
        } else if (social < grade) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(grade));
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
