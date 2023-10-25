package FirstStapsInCoding.moreExercises;

import java.util.Scanner;

public class x06_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceMackerel = Double.parseDouble(scanner.nextLine());
        double priceToy = Double.parseDouble(scanner.nextLine());
        double weightBonito = Double.parseDouble(scanner.nextLine());
        double weightHorseMackerel = Double.parseDouble(scanner.nextLine());
        int weightМussels = Integer.parseInt(scanner.nextLine());
        double priceМussels = 7.50;
        double priceBonito = priceMackerel * 1.6;
        double totalBonito = weightBonito * priceBonito;
        double priceHorseMackerel = priceToy * 1.8;
        double totalHorseMackerel = weightHorseMackerel * priceHorseMackerel;
        double totalMussels = weightМussels * priceМussels;
        double total = totalBonito + totalHorseMackerel + totalMussels;
        System.out.printf("%.2f", total);
    }
}
