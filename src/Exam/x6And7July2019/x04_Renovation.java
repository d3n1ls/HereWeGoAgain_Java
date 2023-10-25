package Exam.x6And7July2019;

import java.util.Scanner;

public class x04_Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wallHeight = Integer.parseInt(scanner.nextLine());
        int wallWidth = Integer.parseInt(scanner.nextLine());
        int noPaintPercentage = Integer.parseInt(scanner.nextLine());

        int wallsArea = 4 * wallWidth * wallHeight;
        int areaToPaint = (int) Math.ceil(wallsArea - wallsArea / 100.0 * noPaintPercentage);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Tired!")) {
                System.out.printf("%d quadratic m left.",
                        areaToPaint);
                break;
            }
            int litersPaint = Integer.parseInt(input);
            areaToPaint -= litersPaint;

            if (areaToPaint == 0) {
                System.out.println("All walls are painted! Great job, Pesho!");
                break;
            } else if (areaToPaint < 0) {
                System.out.printf("All walls are painted and you have %d l paint left!", Math.abs(areaToPaint));
                break;
            }
        }
    }
}
