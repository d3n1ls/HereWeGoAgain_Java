package Exam.x19March2017;

import java.util.Scanner;

public class x06_ControlNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int control = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 1; j--) {
                sum = sum + (i * 2) + (j * 3);
                counter++;
                if (sum >= control) {
                    break;
                }
            }
            if (sum >= control) {
                break;
            }
        }
        if (sum >= control) {
            System.out.println(counter + " moves");
            System.out.printf("Score: %d >= %d", sum, control);
        } else {
            System.out.println(counter + " moves");
        }
    }
}
