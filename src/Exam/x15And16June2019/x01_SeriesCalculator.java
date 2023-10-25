package Exam.x15And16June2019;

import java.util.Scanner;

public class x01_SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seasonsCount = Integer.parseInt(scanner.nextLine());
        int episodesCount = Integer.parseInt(scanner.nextLine());
        double episodeDurationWithoutAds = Double.parseDouble(scanner.nextLine());

        double episodeDurationWithAds = episodeDurationWithoutAds * 1.2;
        double timeNeeded = (seasonsCount * episodesCount * episodeDurationWithAds) + (seasonsCount * 10);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, Math.floor(timeNeeded));
    }
}
