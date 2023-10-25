package Exam.More;

import java.util.Scanner;

public class TrainersSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lectures = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double lectureJelev = 0;
        double lectureRoYaL = 0;
        double lectureRoli = 0;
        double lectureTrofon = 0;
        double lectureSino = 0;
        double lectureOthers = 0;

        double salaryForLecture = budget / lectures;
        double salaryJelev = 0;
        double salaryRoYaL = 0;
        double salaryRoli = 0;
        double salaryTrofon = 0;
        double salarySino = 0;
        double salaryOthers = 0;

        for (int i = 0; i < lectures; i++) {
            String name = scanner.nextLine();

            if (name.equals("Jelev")) {
                lectureJelev++;
                salaryJelev = lectureJelev * salaryForLecture;
            } else if (name.equals("RoYaL")) {
                lectureRoYaL++;
                salaryRoYaL = lectureRoYaL * salaryForLecture;
            } else if (name.equals("Roli")) {
                lectureRoli++;
                salaryRoli = lectureRoli * salaryForLecture;
            } else if (name.equals("Trofon")) {
                lectureTrofon++;
                salaryTrofon = lectureTrofon * salaryForLecture;
            } else if (name.equals("Sino")) {
                lectureSino++;
                salarySino = lectureSino * salaryForLecture;
            } else {
                lectureOthers++;
                salaryOthers = lectureOthers * salaryForLecture;
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
