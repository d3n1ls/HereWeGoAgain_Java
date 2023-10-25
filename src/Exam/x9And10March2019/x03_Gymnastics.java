package Exam.x9And10March2019;

import java.util.Scanner;

public class x03_Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String tool = scanner.nextLine();

        double difficulty = 0;
        double performance = 0;

        switch (country) {
            case "Russia":
                if (tool.equals("ribbon")) {
                    difficulty = 9.1;
                    performance = 9.4;
                } else if (tool.equals("hoop")) {
                    difficulty = 9.3;
                    performance = 9.8;
                } else if (tool.equals("rope")) {
                    difficulty = 9.6;
                    performance = 9;
                }
                break;
            case "Bulgaria":
                if (tool.equals("ribbon")) {
                    difficulty = 9.6;
                    performance = 9.4;
                } else if (tool.equals("hoop")) {
                    difficulty = 9.55;
                    performance = 9.75;
                } else if (tool.equals("rope")) {
                    difficulty = 9.5;
                    performance = 9.4;
                }
                break;
            case "Italy":
                if (tool.equals("ribbon")) {
                    difficulty = 9.2;
                    performance = 9.5;
                } else if (tool.equals("hoop")) {
                    difficulty = 9.45;
                    performance = 9.35;
                } else if (tool.equals("rope")) {
                    difficulty = 9.7;
                    performance = 9.15;
                }
                break;
        }
        double score = difficulty + performance;
        System.out.printf("The team of %s get %.3f on %s.%n", country, score, tool);

        double percent = ((20 - score) / 20) * 100;
        System.out.printf("%.2f%%", percent);
    }
}
