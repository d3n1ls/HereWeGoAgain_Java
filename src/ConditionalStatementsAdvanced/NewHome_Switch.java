import java.util.Scanner;

public class NewHome_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rose = 5;
        double dahlia = 3.8;
        double tulip = 2.8;
        double narcissus = 3;
        double gladiola = 2.5;

        String flower = scanner.nextLine();
        int numberFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double leftMoney = 0;
        double needMoney = 0;

        switch (flower) {
            case "rose":
                if (numberFlower >= 90) {
                    price = (numberFlower * rose) * (1 - 0.1);
                }else{
                    price = numberFlower * rose;
                }
                break;
            case "dahlia":
                if (numberFlower >= 80) {
                    price = (numberFlower * dahlia) * (1 - 0.15);
                }else{
                    price = numberFlower * dahlia;
                }
                break;
            case "tulip":
                if (numberFlower >= 80) {
                    price = (numberFlower * tulip) * (1 - 0.15);
                }else{
                    price = numberFlower * tulip;
                }
                break;
            case "narcissus":
                if (numberFlower < 120) {
                    price = (numberFlower * narcissus) * (1 + 0.15);
                }else{
                    price = numberFlower * narcissus;
                }
                break;
            case "gladiola":
                if (numberFlower < 80) {
                    price = (numberFlower * gladiola) * (1 + 0.2);
                }else{
                    price = numberFlower * gladiola;
                }
                break;
        }
            if (budget > price) {
                leftMoney = budget - price;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlower, flower, leftMoney);
            } else {
                needMoney = Math.abs(budget - price);
                System.out.printf("Not enough money, you need %.2f leva more.", needMoney);
            }
        }

    }

