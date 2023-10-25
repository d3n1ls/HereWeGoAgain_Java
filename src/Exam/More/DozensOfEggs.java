package Exam.More;

import java.util.Scanner;

public class DozensOfEggs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int eggsCount = 0;

        for (int i = 0; i < 7; i++) {
            String[] input = scan.nextLine().split("\\s+");
            int count = Integer.parseInt(input[0]);
            String measure = input[1];

            if (measure.equals("eggs")) {
                eggsCount += count;
            } else {
                eggsCount += (count * 12);
            }
        }

        int dozens = eggsCount / 12;
        int eggs = eggsCount % 12;

        System.out.printf("%s dozens + %s eggs", dozens, eggs);
    }
}
