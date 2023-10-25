package ConditionalStatementsAdvanced.moreExercise;

import java.util.Scanner;

public class x02_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String typeOfRoute = scanner.nextLine();

        double tax = 0.0;
        switch (typeOfRoute) {
            case "trail":
                tax = juniors * 5.50 + seniors * 7;
                break;
            case "cross-country":
                if ((juniors + seniors) >= 50) {
                    tax = juniors * 8 + seniors * 9.50;
                    tax = tax - tax * 0.25;
                } else {
                    tax = juniors * 8 + seniors * 9.50;
                }
                break;
            case "downhill":
                tax = juniors * 12.25 + seniors * 13.75;
                break;
            default:
                tax = juniors * 20 + seniors * 21.50;
                break;
        }
        double totalTax = tax - tax * 0.05;
        System.out.printf("%.2f", totalTax);
    }
}
