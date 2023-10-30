import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumber = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        for (int number = 1; number <= countNumber; number++) {
            int value = Integer.parseInt(scanner.nextLine());

            if (value > max) {
                max = value;

            }

        }
    }
}
// 2.46
