package Exam.More;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double tShirt = Double.parseDouble(inp.nextLine());
        double target = Double.parseDouble(inp.nextLine());

        double shorts = (double) 75 / 100 * tShirt;
        double socks = (double) 20 / 100 * shorts;
        double shoes = 2 * (tShirt + shorts);

        double finalSum = 85 / 100.0 * (tShirt + shorts + socks + shoes);

        if (finalSum >= target) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", finalSum);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", target - finalSum);
        }
    }
}
