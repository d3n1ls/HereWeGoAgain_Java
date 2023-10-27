import java.util.Scanner;

public class NumsThreeFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num % 3 == 0) {
            System.out.printf("Числото %d се дели на 3", num);
        } else if (num % 5 == 0) {
            System.out.printf("Числото %d се дели на 5", num);
        } else {
            System.out.println("Числото не се дели на 3 или на 5");
        }
    }
}
