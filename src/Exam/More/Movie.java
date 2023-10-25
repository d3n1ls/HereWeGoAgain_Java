package Exam.More;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = Integer.parseInt(scan.nextLine());
        int profit = 0;

        String input = scan.nextLine();
        while (!input.equals("Movie time!")) {
            int visitors = Integer.parseInt(input);
            if (capacity - visitors >= 0) {
                capacity =capacity -visitors;
                profit = profit + visitors * 5;
                if (visitors % 3 == 0) {
                    profit -= 5;
                }
            } else {
                System.out.println("The cinema is full.");
                break;
            }
            input = scan.nextLine();

        }
        if (input.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.%n", capacity);
        }
        System.out.printf("Cinema income - %d lv.", profit);


    }
}
