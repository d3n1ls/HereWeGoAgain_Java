package Exam.e23And24October2021;

import java.util.Scanner;

public class x02_MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double partyPrice = Double.parseDouble(scanner.nextLine());
        int loveMessages = Integer.parseInt(scanner.next());
        int roses = Integer.parseInt(scanner.next());
        int keychains = Integer.parseInt(scanner.next());
        int cartoons = Integer.parseInt(scanner.next());
        int lucks = Integer.parseInt(scanner.next());

        double price = loveMessages * 0.60 + roses * 7.20 + keychains * 3.60 + cartoons * 18.20 + lucks * 22;
        int count = loveMessages + roses + keychains + cartoons + lucks;

        if (count >= 25) {
            price *= 0.65;
        }
        price *= 0.90;

        if (partyPrice <= price) {

            System.out.printf("Yes! %.2f lv left.", price - partyPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", partyPrice - price);
        }
    }

}
