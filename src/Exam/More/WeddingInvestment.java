package Exam.More;

import java.util.Scanner;

public class WeddingInvestment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String term = scan.nextLine();
        String type = scan.nextLine();
        String dessert = scan.nextLine();
        int months = Integer.parseInt(scan.nextLine());
        double price = 0.0;

        if (term.equals("one")) {
            switch (type) {
                case "Small": price = 9.98; break;
                case "Middle": price = 18.99; break;
                case "Large": price = 25.98; break;
                case "ExtraLarge": price = 35.99; break;
            }
        } else if (term.equals("two")) {
            switch (type) {
                case "Small": price = 8.58; break;
                case "Middle": price = 17.09; break;
                case "Large": price = 23.59; break;
                case "ExtraLarge": price = 31.79; break;
            }
        }

        if (dessert.equals("yes")) {
            if (price <= 10) {
                price += 5.50;
            } else if (price <= 30) {
                price += 4.35;
            } else {
                price += 3.85;
            }
        }

        if (term.equals("two")) {
            price -= price * 0.0375;
        }

        System.out.printf("%.2f lv.", price * months);
    }
}
