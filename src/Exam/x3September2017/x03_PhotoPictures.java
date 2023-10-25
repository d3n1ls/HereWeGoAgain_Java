package Exam.x3September2017;

import java.util.Scanner;

public class x03_PhotoPictures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String typePics = scanner.nextLine();
        String orderType = scanner.nextLine();

        double price = 0;
        double sum = 0;

        switch (typePics) {
            case "9X13":
                if (count >= 50) {
                    price = count * 0.16;
                    sum = price - price * 0.05;
                } else {
                    sum = count * 0.16;
                }
                break;
            case "10X15":
                if (count >= 80) {
                    price = count * 0.16;
                    sum = price - price * 0.03;
                } else {
                    sum = count * 0.16;
                }
                break;
            case "13X18":
                if (count >= 50 && count <= 100) {
                    price = count * 0.38;
                    sum = price - price * 0.03;
                } else if (count > 100) {
                    price = count * 0.38;
                    sum = price - price * 0.05;
                } else {
                    sum = count * 0.38;
                }
                break;
            case "20X30":
                if (count >= 10 && count <= 50) {
                    price = count * 2.90;
                    sum = price - price * 0.07;
                } else if (count > 50) {
                    price = count * 2.90;
                    sum = price - (price * 0.09);
                } else {
                    sum = count * 2.90;
                }
                break;
        }
        if ("online".equalsIgnoreCase(orderType)) {
            System.out.printf("%.2fBGN", sum - (sum * 0.02));
        } else {
            System.out.printf("%.2fBGN", sum);
        }
    }
}
