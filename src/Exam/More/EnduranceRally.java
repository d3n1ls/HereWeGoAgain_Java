package Exam.More;

import java.util.Scanner;

public class EnduranceRally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] drivers = scanner.nextLine().trim().split("\\s+");
        String[] trackLayout = scanner.nextLine().trim().split("\\s+");
        String[] checkPoints = scanner.nextLine().trim().split("\\s+");

        double[] trackZones = new double[trackLayout.length];
        int index = 0;
        for (String trackZone : trackLayout) {
            trackZones[index++] = Double.parseDouble(trackZone);
        }

        boolean[] isCheckPoint = new boolean[trackLayout.length];
        for (int i = 0; i < isCheckPoint.length; i++) {
            isCheckPoint[i] = false;
        }

        for (String checkPoint : checkPoints) {
            index = Integer.parseInt(checkPoint);
            if (index >= 0 && index < trackZones.length) {
                isCheckPoint[index] = true;
            }
        }

        for (String driver : drivers) {
            double fuel = driver.charAt(0);
            boolean finished = true;
            int zoneReached;

            for (zoneReached = 0; zoneReached < trackZones.length; zoneReached++) {
                if (isCheckPoint[zoneReached]) {
                    fuel += trackZones[zoneReached];
                } else {
                    fuel -= trackZones[zoneReached];
                }

                if (fuel <= 0d) {
                    finished = false;
                    break;
                }
            }

            if (finished) {
                System.out.printf("%s - fuel left %.2f%n", driver, fuel);
            } else {
                System.out.printf("%s - reached %d%n", driver, zoneReached);
            }
        }
    }
}
