package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class x08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinutes;
        int arriveTime = arriveHour * 60 + arriveMinutes;

        String output = "";
        String status = "";

        if (arriveTime < examTime - 30) {
            status = "Early";
            int diff = examTime - arriveTime;
            if (diff < 60) {
                output = String.format("%d minutes before the start", diff);
            } else {
                int h = diff / 60;
                int m = diff % 60;
                output = String.format("%d:%02d hours before the start", h, m);
            }
        } else if (arriveTime <= examTime) {
            status = "On Time";
            int diff = examTime - arriveTime;
            output = String.format("%d minutes before the start", diff);
        } else {
            status = "Late";
            int diff = arriveTime - examTime;
            if (diff < 60) {
                output = String.format("%d minutes after the start", diff);
            } else {
                int h = diff / 60;
                int m = diff % 60;
                output = String.format("%d:%02d hours after the start", h, m);
            }
        }
        System.out.println(status);
        System.out.println(output);
    }
}
