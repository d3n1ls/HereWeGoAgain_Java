package Exam.More;

import java.util.Scanner;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tickets = scanner.nextLine().split(",");

        for (String ticket : tickets) {
            ticket = ticket.trim();
            if (ticket.length() == 20) {
                char winningChar = '\0';
                char currentChar = '\0';
                int longestSequence = 0;
                int currentSequence = 0;

                for (int j = 0; j < 10; j++) {
                    switch (ticket.charAt(j)) {
                        case '@':
                        case '#':
                        case '$':
                        case '^':
                            if (currentChar != ticket.charAt(j)) {
                                if (currentSequence > longestSequence) {
                                    longestSequence = currentSequence;
                                    winningChar = currentChar;
                                }
                                currentChar = ticket.charAt(j);
                                currentSequence = 1;
                            } else {
                                currentSequence++;
                            }
                            break;
                        default:
                            if (currentSequence > longestSequence) {
                                longestSequence = currentSequence;
                                winningChar = currentChar;
                            }
                            currentSequence = 0;
                            currentChar = '\0';
                            break;
                    }
                }

                if (currentSequence > longestSequence) {
                    longestSequence = currentSequence;
                    winningChar = currentChar;
                }

                int secondLongestSequence = 0;
                currentSequence = 0;
                if (longestSequence >= 6) {
                    for (int j = 10; j < 20; j++) {
                        if (ticket.charAt(j) == winningChar) {
                            currentSequence++;
                        } else {
                            if (currentSequence > secondLongestSequence) {
                                secondLongestSequence = currentSequence;
                            }
                            currentSequence = 0;
                        }
                    }
                }

                if (currentSequence > secondLongestSequence) {
                    secondLongestSequence = currentSequence;
                }

                longestSequence = Math.min(longestSequence, secondLongestSequence);

                if (longestSequence == 10) {
                    System.out.printf("ticket \"%s\" - %d%c Jackpot!%n", ticket, longestSequence, winningChar);
                } else if (longestSequence >= 6) {
                    System.out.printf("ticket \"%s\" - %d%c%n", ticket, longestSequence, winningChar);
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", ticket);
                }
            } else {
                System.out.println("invalid ticket");
            }
        }
    }
}
