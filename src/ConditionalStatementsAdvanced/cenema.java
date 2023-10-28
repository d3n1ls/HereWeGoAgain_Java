import java.util.Scanner;

public class cenema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double premiere = 12.00;
        double normal = 7.50;
        double discount = 5.00;
        double price = 0.0;

        String typeMovie = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int cell = Integer.parseInt(scanner.nextLine());

        switch (typeMovie) {
            case "premiere":
                price = 12.00;
                break;
            case "normal":
                price = 7.50;
                break;
            case "discount":
                price = 5.00;
                break;
        }
        System.out.printf("%.2f leva", price * (row * cell));
    }
}
