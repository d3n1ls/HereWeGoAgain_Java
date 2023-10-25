package Exam.More;

import java.math.BigInteger;
import java.util.Scanner;

public class EmergencyRepairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger wallNumber = new BigInteger(scanner.nextLine());
        int repairKits = Integer.parseInt(scanner.nextLine());
        int attacks = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < attacks; i++) {
            int attackedBit = Integer.parseInt(scanner.nextLine());
            wallNumber = wallNumber.clearBit(attackedBit);
        }

        boolean shouldRepair = false;

        for (int i = 0; i < 64; i++) {
            if (!wallNumber.testBit(i)) {
                if (shouldRepair) {
                    if (repairKits > 0 && !wallNumber.testBit(i - 1)) {
                        wallNumber = wallNumber.setBit(i - 1);
                        repairKits--;
                    }

                    if (repairKits > 0) {
                        wallNumber = wallNumber.setBit(i);
                        repairKits--;
                    }
                }
                shouldRepair = true;
            } else {
                shouldRepair = false;
            }

            if (repairKits <= 0) {
                break;
            }
        }

        System.out.println(wallNumber.toString());
    }
}
