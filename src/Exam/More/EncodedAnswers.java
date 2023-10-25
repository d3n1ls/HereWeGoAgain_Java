package Exam.More;

import java.util.Scanner;

public class EncodedAnswers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int questions = Integer.parseInt(scanner.nextLine());
        long encryption;
        int countAs = 0;
        int countBs = 0;
        int countCs = 0;
        int countDs = 0;

        for (int i = 0; i < questions; i++) {
            encryption = Long.parseLong(scanner.nextLine());
            int reminder = (int) (encryption % 4L);
            switch (reminder) {
                case 0:
                    System.out.print("a ");
                    countAs++;
                    break;
                case 1:
                    System.out.print("b ");
                    countBs++;
                    break;
                case 2:
                    System.out.print("c ");
                    countCs++;
                    break;
                case 3:
                    System.out.print("d ");
                    countDs++;
                    break;
                default:
                    break;
            }
        }

        System.out.println();
        System.out.printf("Answer A: %d%n", countAs);
        System.out.printf("Answer B: %d%n", countBs);
        System.out.printf("Answer C: %d%n", countCs);
        System.out.printf("Answer D: %d%n", countDs);
    }
}
