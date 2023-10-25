package ConditionalStatementsAdvanced.moreExercise;

import java.util.Scanner;

public class x07_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int night = Integer.parseInt(scanner.nextLine());

        String sport = "";
        double price = 0.0;

        switch (season) {
            case "Winter":
                if (groupType.equals("boys")) {
                    sport = "Judo";
                    price = students * night * 9.60;
                } else if (groupType.equals("girls")) {
                    sport = "Gymnastics";
                    price = students * night * 9.60;
                } else {
                    sport = "Ski";
                    price = students * night * 10.00;
                }
                break;
            case "Spring":
                if (groupType.equals("boys")) {
                    sport = "Tennis";
                    price = students * night * 7.20;
                } else if (groupType.equals("girls")) {
                    sport = "Athletics";
                    price = students * night * 7.20;
                } else {
                    sport = "Cycling";
                    price = students * night * 9.50;
                }
                break;
            case "Summer":
                if (groupType.equals("boys")) {
                    sport = "Football";
                    price = students * night * 15.00;
                } else if (groupType.equals("girls")) {
                    sport = "Volleyball";
                    price = students * night * 15.00;
                } else {
                    sport = "Swimming";
                    price = students * night * 20.00;
                }
                break;
        }
        if (students >= 50) {
            price *= 0.50;
        } else if (students >= 20) {
            price *= 0.85;
        } else if (students >= 10) {
            price *= 0.95;
        }
        System.out.printf("%s %.2f lv.", sport, price);

    }
}
