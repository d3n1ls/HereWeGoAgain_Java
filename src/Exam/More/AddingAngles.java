package Exam.More;

import java.util.Scanner;

public class AddingAngles {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String[] input = scn.nextLine().split(" ");
        boolean hasSet = false;

        int[] angles = new int[n];

        for (int i = 0; i < input.length; i++) {
            angles[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < angles.length; i++) {
            for (int j = i + 1; j < angles.length; j++) {
                for (int k = j + 1; k < angles.length; k++) {
                    if ((angles[i] + angles[j] + angles[k]) % 360 == 0) {
                        hasSet = true;
                        int sum = angles[i] + angles[j] + angles[k];
                        System.out.printf("%d + %d + %d = %d degrees\n",
                                angles[i], angles[j], angles[k], sum);
                    }

                }
            }
        }
        if (!hasSet) {
            System.out.println("No");
        }

    }

}
