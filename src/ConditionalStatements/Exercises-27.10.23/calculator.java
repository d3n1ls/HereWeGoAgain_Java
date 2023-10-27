import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        String gathering = "+";
        String subtraction = "-";
        String multiplication = "*";
        String division = "/";
        int result = 0;
        String symbol = scanner.nextLine();
        if (symbol.equals(gathering)) {
            result = num1 + num2;
        } else if (symbol.equals(subtraction)) {
            result = num1 - num2;
        } else if (symbol.equals(multiplication)) {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }
        System.out.println(result);
    }
}
