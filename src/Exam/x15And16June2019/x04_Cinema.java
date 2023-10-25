package Exam.x15And16June2019;

import java.util.Scanner;

public class x04_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        int totalPeople = 0;
        int totalProfit = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Movie time!")) {
                System.out.printf("There are %d seats left in the cinema.%n", capacity - totalPeople);
                break;
            }
            int people = Integer.parseInt(input);

            if (totalPeople + people > capacity) {
                System.out.println("The cinema is full.");
                break;
            }
            int price = people * 5;
            totalPeople += people;

            if (people % 3 == 0) {
                price -= 5;
            }
            totalProfit += price;
        }
        System.out.printf("Cinema income - %d lv.", totalProfit);
    }
}
