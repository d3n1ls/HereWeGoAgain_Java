package Exam.More;

import java.util.Scanner;

public class StuckNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //parse the numbers count
        int n = scan.nextInt();

        //store the numbers in an array
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        //check if a solution was found
        boolean validSolution = false;

        //go through all combinations
        for (int a = 0; a < nums.length; a++) {
            for (int b = 0; b < nums.length; b++) {
                for (int c = 0; c < nums.length; c++) {
                    for (int d = 0; d < nums.length; d++) {
                        //check only different numbers
                        if (a != b && a != c && a != d &&
                                b != c && b != d && c != d) {

                            //assemble the two sides of the equation
                            String left = "" + nums[a] + nums[b];
                            String right = "" + nums[c] + nums[d];

                            //compare the strings
                            if (left.equals(right)) {
                                validSolution = true;
                                //print the result
                                System.out.printf("%s|%s==%s|%s",
                                        nums[a], nums[b], nums[c], nums[d]);
                                System.out.println();
                            }

                        }
                    }
                }
            }
        }
        //print No if no solution was found
        if (validSolution == false) {
            System.out.println("No");
        }
    }
}
