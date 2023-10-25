package Exam.x28And29March2020;

import java.util.Scanner;

public class x04_FoodForPets01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        double foodTotal = Double.parseDouble(scan.nextLine());
        double biscuits = 0;
        double dog = 0;
        double cat = 0;
        double food = 0;

        for (int i = 1, count = 1; i <= days; i++, count++) {
            int foodDog = Integer.parseInt(scan.nextLine());
            int foodCat = Integer.parseInt(scan.nextLine());
            if (count == 3) {
                biscuits += (foodDog + foodCat) * 0.1;
                count = 0;
            }
            dog += foodDog;
            cat += foodCat;
            food += (foodDog + foodCat);
        }
        System.out.printf("Total eaten biscuits: %.0fgr.\n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n", ((food / foodTotal) * 100));
        System.out.printf("%.2f%% eaten from the dog.\n", ((dog / food) * 100));
        System.out.printf("%.2f%% eaten from the cat.\n", ((cat / food) * 100));
        scan.close();
    }
}
