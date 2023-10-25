package ConditionalStatements.exercise;

import java.util.Scanner;

public class x01_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int allTimeInSeconds = first + second + third;
        int minutes = allTimeInSeconds / 60;
        int sec = allTimeInSeconds % 60;
        if (sec < 10) {
            System.out.printf("%d:0%d", minutes, sec);
        } else {
            System.out.printf("%d:%d", minutes, sec);
        }
    }
}
