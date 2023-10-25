package FirstStapsInCoding.lab;

import java.util.Scanner;

public class x08_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDog = Integer.parseInt(scanner.nextLine());
        int numCat = Integer.parseInt(scanner.nextLine());
        double sum = (numDog * 2.50) + (numCat * 4);
        System.out.println(sum + " lv.");
    }
}
