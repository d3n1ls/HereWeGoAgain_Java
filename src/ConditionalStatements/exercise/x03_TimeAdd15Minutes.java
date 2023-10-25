package ConditionalStatements.exercise;

import java.util.Scanner;

public class x03_TimeAdd15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt((scanner.nextLine()));
        int min15 = min + 15;
        int totalMin = hours * 60 + min15;
        int finalHours = totalMin / 60;
        if (finalHours == 24) {
            finalHours = 0;
        } else {
            finalHours = finalHours;
        }
        int finalMin = totalMin % 60;
        if (finalMin < 10) {
            System.out.printf("%d:0%d", finalHours, finalMin);
        } else {
            System.out.printf("%d:%d", finalHours, finalMin);
        }
    }
}
