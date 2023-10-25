package WhileLoop.moreExercises;

import java.util.Scanner;

public class x03_StreamOfLetters01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder();
        boolean cIsActivated = false;
        boolean oIsActivated = false;
        boolean nIsActivated = false;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                break;
            }

            char symbol = input.charAt(0);

            if (Character.isLetter(symbol)) {
                if (symbol == 'c' && !cIsActivated) {
                    cIsActivated = true;
                } else if (symbol == 'o' && !oIsActivated) {
                    oIsActivated = true;
                } else if (symbol == 'n' && !nIsActivated) {
                    nIsActivated = true;
                } else {
                    message.append(symbol);
                }
                if (cIsActivated && oIsActivated && nIsActivated) {
                    System.out.print(message + " ");
                    message = new StringBuilder();
                    cIsActivated = false;
                    oIsActivated = false;
                    nIsActivated = false;
                }
            }
        }
    }
}
