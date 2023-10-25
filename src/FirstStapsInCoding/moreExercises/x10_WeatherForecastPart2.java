package FirstStapsInCoding.moreExercises;

import java.util.Scanner;

public class x10_WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = Double.parseDouble(scanner.nextLine());
        if (temp >= 26.00 && temp <= 35.00) {
            System.out.println("Hot");
        } else if (temp >= 20.10 && temp <= 25.90) {
            System.out.println("Warm");
        } else if (temp >= 15.00 && temp <= 20.00) {
            System.out.println("Mild");
        } else if (temp >= 12.00 && temp <= 14.90) {
            System.out.println("Cool");
        } else if (temp >= 5.00 && temp <= 11.90) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}
