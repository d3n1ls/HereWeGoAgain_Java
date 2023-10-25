package Exam.x10And11March2018;

import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstCharacter = scanner.nextLine().charAt(0);
        int firstCharacterRotations = Integer.parseInt(scanner.nextLine());

        char secondCharacter = scanner.nextLine().charAt(0);
        int secondCharacterRotations = Integer.parseInt(scanner.nextLine());

        char thirdCharacter = scanner.nextLine().charAt(0);
        int thirdCharacterRotations = Integer.parseInt(scanner.nextLine());

        for (int i = firstCharacter; i < (int) firstCharacter + firstCharacterRotations; i++) {
            int finalI = (int) firstCharacter + firstCharacterRotations;

            for (int j = secondCharacter; j < (int) secondCharacter + secondCharacterRotations; j++) {
                int finalJ = (int) secondCharacter + secondCharacterRotations;

                for (int k = thirdCharacter; k < (int) thirdCharacter + thirdCharacterRotations; k++) {
                    int finalK = (int) thirdCharacter + thirdCharacterRotations;

                    if (i == (int) firstCharacter + firstCharacterRotations - 1
                            && j == (int) secondCharacter + secondCharacterRotations - 1
                            && k == (int) thirdCharacter + thirdCharacterRotations - 1) {

                        System.out.printf("%c%c%c%n", (char) finalI, (char) finalJ, (char) finalK);

                        if ((char) finalI == '7' && (char) finalJ == '7' && (char) finalK == '7') {
                            System.out.println("*** JACKPOT ***");
                            return;
                        } else if ((char) finalI == '@' && (char) finalJ == '@' && (char) finalK == '@') {
                            System.out.println("!!! YOU LOSE EVERYTHING !!!");
                            return;
                        }
                    }
                }
            }
        }
    }
}
