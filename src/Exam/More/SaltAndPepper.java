package Exam.More;

import java.math.BigInteger;
import java.util.Scanner;

public class SaltAndPepper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number = new BigInteger(scanner.nextLine());

        while (true) {
            String[] input = scanner.nextLine().toLowerCase().trim().split("\\s+");

            if ("end".equals(input[0])) {
                break;
            } else {
                String spice = input[0];
                int step = Integer.parseInt(input[1]);

                if ("salt".equals(spice)) {
                    for (int i = 0; i < 64; i += step) {
                        number = number.clearBit(i);
                    }
                } else if ("pepper".equals(spice)) {
                    for (int i = 0; i < 64; i += step) {
                        number = number.setBit(i);
                    }
                }
            }
        }

        System.out.println(number);
    }
}
