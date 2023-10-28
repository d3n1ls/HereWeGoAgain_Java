import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();

        double answer = 0.0;
        String evenOrOdd = "";

        switch (operator) {
            case "+":
                answer = n1 + n2;
                if (answer % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%.0f + %.0f = %.0f - %s",n1,n2,answer,evenOrOdd);
                break;
            case "-":
                answer = n1 - n2;
                if (answer % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%.0f - %.0f = %.0f - %s",n1,n2,answer,evenOrOdd);
                break;
            case "*":
                answer = n1 * n2;
                if (answer % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%.0f * %.0f = %.0f - %s",n1,n2,answer,evenOrOdd);
                break;
            case "/":
                if(n2==0){
                    System.out.printf("Cannot divide %.0f by zero",n1);
                }
                else {
                    answer = n1 / n2;
                    System.out.printf("%.0f / %.0f = %.2f",n1,n2,answer);
                }
                break;
            case "%":
                if(n2==0){
                    System.out.printf("Cannot divide %.0f by zero",n1);
                }
                else {
                    answer = n1 % n2;
                    System.out.printf("%.0f %% %.0f = %.0f", n1, n2, answer);
                }
            default:
                break;
        }
    }
}

