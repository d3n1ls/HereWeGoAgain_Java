import java.util.Scanner;

public class rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double point = Double.parseDouble(scanner.nextLine());

        if (point <= 30) {
            System.out.println("Excellent!");
        }
        if (point <= 20) {
            System.out.println("Very Good!");
        }
        if (point <= 15) {
            System.out.println("Good!");
        }
        if (point <= 10) {
            System.out.println("Middle");
        } else {
            System.out.println("Bad!");
        }
    }
}
//rate.java
