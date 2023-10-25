package WhileLoop.exercises;

import java.util.Scanner;

public class x00_DemoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            int age = Integer.parseInt(scanner.nextLine());
            if (age > 30) {
                input = scanner.nextLine();
                continue;
            }
            System.out.println(input + " " + age);
            input = scanner.nextLine();
        }
    }
}
