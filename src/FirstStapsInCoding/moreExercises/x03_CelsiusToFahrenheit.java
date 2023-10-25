package FirstStapsInCoding.moreExercises;

import java.util.Scanner;

public class x03_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Celsius = Double.parseDouble(scanner.nextLine());
        double Fahrenheit = Celsius * 1.8 + 32;
        System.out.printf("%.2f", Fahrenheit);
    }
}
