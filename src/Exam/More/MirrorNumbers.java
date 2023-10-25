package Exam.More;

import java.util.Scanner;

public class MirrorNumbers {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = 0;
        n = Integer.parseInt(scn.nextLine());
        String[] input = scn.nextLine().split(" ");
        boolean noNums = true;

        for (int i = 0; i < n; i++) {
            String reverse = new StringBuilder(input[i]).reverse().toString();
            for (int j = i; j < n; j++) {
                if (input[j].equals(reverse) && !input[i].equals(input[j])) {
                    System.out.printf("%s<!>%s\n", input[i], input[j]);
                    noNums = false;
                }
            }
        }
        if (noNums) {
            System.out.println("No");
        }
    }

}
