package Exam.More;

import java.util.Scanner;

public class TicketCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticketCombination = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (char i = 'B'; i <= 'L'; i++) {
            for (char j = 'f'; j >= 'a'; j--) {
                for (char k = 'A'; k <= 'C'; k++) {
                    for (int l = 1; l <= 10; l++) {
                        for (int m = 10; m >= 1; m--) {
                            if (i % 2 == 0) {
                                count++;
                            }
                            if (count == ticketCombination) {
                                System.out.println("Ticket combination: " + i + j + k + l + m);
                                System.out.println("Prize: " + (i + j + k + l + m) + " lv.");
                            }
                        }
                    }
                }
            }
        }
    }
}
