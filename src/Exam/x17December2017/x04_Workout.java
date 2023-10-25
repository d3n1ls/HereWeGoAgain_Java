package Exam.x17December2017;

import java.util.Scanner;

public class x04_Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());

        double sumMoreKm = m;
        for (int i = 0; i < n; i++) {
            int percentMore = Integer.parseInt(scanner.nextLine());

            m = m + (m * percentMore / 100.0);

            sumMoreKm = sumMoreKm + m;
        }
        double diff = Math.abs(1000 - sumMoreKm);
        if (sumMoreKm >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(diff));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(diff));
        }
    }
}
