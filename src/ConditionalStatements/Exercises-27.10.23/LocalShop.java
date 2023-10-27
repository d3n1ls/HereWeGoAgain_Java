import java.util.Scanner;

public class LocalShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (city) {
            case "Sofia":
                if (product.equals("coffee")) {
                    price = 0.5;
                } else if (product.equals("water")) {
                    price = 0.8;
                } else if (product.equals("beer")) {
                    price = 1.2;
                } else if (product.equals("sweets")) {
                    price = 1.45;
                } else if (product.equals("peanuts")) {
                    price = 1.6;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    price = 0.4;
                } else if (product.equals("water")) {
                    price = 0.7;
                } else if (product.equals("beer")) {
                    price = 1.15;
                } else if (product.equals("sweets")) {
                    price = 1.3;
                } else if (product.equals("peanuts")) {
                    price = 1.5;
                }
                break;
            case "Varna":
                if (product.equals("coffee")) {
                    price = 0.45;
                } else if (product.equals("water")) {
                    price = 0.7;
                } else if (product.equals("beer")) {
                    price = 1.1;
                } else if (product.equals("sweets")) {
                    price = 1.35;
                } else if (product.equals("peanuts")) {
                    price = 1.55;
                }
                break;
        }
        double total = number * price;
        System.out.println(total);

    }
}


