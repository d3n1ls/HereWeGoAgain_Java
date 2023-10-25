package Exam.x19March2017;

import java.util.Scanner;

public class x03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String accommodation = "";
        String location = "";
        double sum = 0.0;

        if (budget <= 1000) {
            accommodation = "Camp";
            if ("Summer".equalsIgnoreCase(season)) {
                location = "Alaska";
                sum = budget * 0.65;
            } else if ("Winter".equalsIgnoreCase(season)) {
                location = "Morocco";
                sum = budget * 0.45;
            }
        } else if (budget <= 3000) {
            accommodation = "Hut";
            if ("Summer".equalsIgnoreCase(season)) {
                location = "Alaska";
                sum = budget * 0.80;
            } else if ("Winter".equalsIgnoreCase(season)) {
                location = "Morocco";
                sum = budget * 0.60;
            }
        } else {
            accommodation = "Hotel";
            sum = budget * 0.90;
            if ("Summer".equalsIgnoreCase(season)) {
                location = "Alaska";
            } else if ("Winter".equalsIgnoreCase(season)) {
                location = "Morocco";
            }
        }
        System.out.printf("%s - %s - %.2f", location, accommodation, sum);
    }
}
