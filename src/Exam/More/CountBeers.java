package Exam.More;

import java.util.Scanner;

public class CountBeers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int beersCount = 0;

        while (true) {
            String input = scan.nextLine().trim();
            if (input.equals("End")) {
                break;
            }

            String[] line = input.split("\\s+");

            int count = Integer.parseInt(line[0]);
            String measure = line[1];

            if (measure.equals("stacks")) {
                beersCount += 20 * count;
            } else {
                beersCount += count;
            }
        }

        int beers = beersCount % 20;
        int stacks = beersCount / 20;

        System.out.printf("%s stacks + %s beers", stacks, beers);
    }
}
