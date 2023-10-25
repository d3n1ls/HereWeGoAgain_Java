package Exam.x6March2016;

import java.util.Scanner;

public class x03_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int allMinutesExam = (examHour * 60) + examMinutes;
        int allMinutesArrive = (arriveHour * 60) + arriveMinutes;

        int hour = 0;
        int minutes = 0;

        int margin = Math.abs(allMinutesArrive - allMinutesExam);

        if (allMinutesExam < allMinutesArrive) {
            hour = margin / 60;
            minutes = margin % 60;
            if (hour < 1) {
                System.out.printf("Late%n%d minutes after the start", minutes);
            } else {
                System.out.printf("Late%n%d:%02d hours after the start", hour, minutes);
            }
        } else if (allMinutesExam > allMinutesArrive) {
            if (margin > 30) {
                hour = margin / 60;
                minutes = margin % 60;
                if (hour < 1) {
                    System.out.printf("Early%n%d minutes before the start", minutes);
                } else {
                    System.out.printf("Early%n%d:%02d hours before the start", hour, minutes);
                }
            } else {
                minutes = margin % 60;
                System.out.printf("On time%n%d minutes before the start", minutes);
            }
        } else {
            System.out.printf("On time");
        }
    }
}
