package ConditionalStatements.moreExercise;

import java.util.Scanner;

public class x05_Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int еmployees = Integer.parseInt(scanner.nextLine());

        double hours = (days - (days * 0.10)) * 8;
        double overtimeDays = еmployees * (2 * days);
        double totalHours = hours + overtimeDays;
        if (neededHours <= totalHours) {
            System.out.printf("Yes!%.0f hours left.", Math.floor(totalHours - neededHours));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", Math.ceil(neededHours - totalHours));
        }
    }
}
