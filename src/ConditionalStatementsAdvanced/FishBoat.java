import java.util.Scanner;

public class FishBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberFisherman = Integer.parseInt(scanner.nextLine());

        String seasons = "";
        double price = 0;

        switch (season) {
            case "spring":
                price = 3000;
                if (numberFisherman % 2 == 0) {
                    price = 3000 * (1 - 0.05);
                }
                break;
            case "summer":
                price = 4200;
                if (numberFisherman % 2 == 0) {
                    price = 4200 * (1 - 0.05);
                }
                break;
            case "autumn":
                price = 4200;
                break;
            case "winter":
                price = 2600;
                if (numberFisherman % 2 == 0) {
                    price = 2600 * (1 - 0.05);
                }
                break;
        }
        if (numberFisherman == 6) {
            price = price - price * 0.1;
        } else if (numberFisherman <= 11 && numberFisherman >= 7) {
            price = price - price * 0.15;
        } else if (numberFisherman > 12) {
            price = price - price * 0.25;
        }
        if (budget > price) {
            System.out.printf("Yes! You have %.2f leva left", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}