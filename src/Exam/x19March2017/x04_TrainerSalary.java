package Exam.x19March2017;

import java.util.Scanner;

public class x04_TrainerSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLecture = Integer.parseInt(scanner.nextLine());
        double haveBudget = Double.parseDouble(scanner.nextLine());

        double salaryOneLecture = haveBudget / countLecture;

        double salaryJelev = 0;
        double salaryRoYaL = 0;
        double salaryRoli = 0;
        double salaryTrofon = 0;
        double salarySino = 0;
        double salaryOthers = 0;

        for (int i = 0; i < countLecture; i++) {
            String name = scanner.nextLine();

            switch (name) {
                case "Jelev":
                    salaryJelev += salaryOneLecture;
                    break;
                case "RoYaL":
                    salaryRoYaL += salaryOneLecture;
                    break;
                case "Roli":
                    salaryRoli += salaryOneLecture;
                    break;
                case "Trofon":
                    salaryTrofon += salaryOneLecture;
                    break;
                case "Sino":
                    salarySino += salaryOneLecture;
                    break;
                default:
                    salaryOthers += salaryOneLecture;
                    break;
            }
        }
        System.out.printf("Jelev salary: %.2f lv%n", salaryJelev);
        System.out.printf("RoYaL salary: %.2f lv%n", salaryRoYaL);
        System.out.printf("Roli salary: %.2f lv%n", salaryRoli);
        System.out.printf("Trofon salary: %.2f lv%n", salaryTrofon);
        System.out.printf("Sino salary: %.2f lv%n", salarySino);
        System.out.printf("Others salary: %.2f lv%n", salaryOthers);
    }
}
