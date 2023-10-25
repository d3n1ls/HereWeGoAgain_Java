package Exam.More;

import java.util.Scanner;

public class LifeOfCats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String breed = scanner.nextLine();
        String sex = scanner.nextLine();
        int years = 0;
        boolean isValid = true;

        if (sex.equals("m")) {
            if (breed.equalsIgnoreCase("British shorthair")) {
                years = 13;
            } else if (breed.equalsIgnoreCase("siamese")) {
                years = 15;
            } else if (breed.equalsIgnoreCase("persian")) {
                years = 14;
            } else if (breed.equalsIgnoreCase("ragdoll")) {
                years = 16;
            } else if (breed.equalsIgnoreCase("american shorthair")) {
                years = 12;
            } else if (breed.equalsIgnoreCase("siberian")) {
                years = 11;
            } else {
                isValid = false;
                System.out.printf("%s is invalid cat!", breed);
            }
        } else if (sex.equals("f")) {
            if (breed.equalsIgnoreCase("British shorthair")) {
                years = 14;
            } else if (breed.equalsIgnoreCase("siamese")) {
                years = 16;
            } else if (breed.equalsIgnoreCase("persian")) {
                years = 15;
            } else if (breed.equalsIgnoreCase("ragdoll")) {
                years = 17;
            } else if (breed.equalsIgnoreCase("american shorthair")) {
                years = 13;
            } else if (breed.equalsIgnoreCase("siberian")) {
                years = 12;
            } else {
                isValid = false;
                System.out.printf("%s is invalid cat!", breed);
            }
        }
        int sum = years * 2;
        if (isValid) {
            System.out.printf("%d cat months", sum);
        }
    }
}
