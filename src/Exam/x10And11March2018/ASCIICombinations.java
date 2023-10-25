package Exam.x10And11March2018;

import java.util.Scanner;

public class ASCIICombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCheckedChars = Integer.parseInt(scanner.nextLine());

        int numbersSum = 0;
        String numbersString = "";

        int bigCharSum = 0;
        String bigString = "";

        int smallCharSum = 0;
        String smalString = "";

        int otherSum = 0;
        String otherString = "";

        for (int i = 0; i < numberOfCheckedChars; i++) {
            char singleCharacter = scanner.nextLine().charAt(0);

            if ((int) singleCharacter >= 48 && (int) singleCharacter <= 57) {
                numbersSum = numbersSum + (int) singleCharacter;
                numbersString = numbersString + singleCharacter;
            } else if ((int) singleCharacter >= 65 && (int) singleCharacter <= 90) {
                bigCharSum = bigCharSum + (int) singleCharacter;
                bigString = bigString + singleCharacter;
            } else if ((int) singleCharacter >= 97 && (int) singleCharacter <= 122) {
                smallCharSum = smallCharSum + (int) singleCharacter;
                smalString = smalString + singleCharacter;
            } else {
                otherSum = otherSum + (int) singleCharacter;
                otherString = otherString + singleCharacter;
            }

        }
        int temp = Math.max(numbersSum, bigCharSum);
        int tempTwo = Math.max(smallCharSum, otherSum);
        int biggestSum = Math.max(temp, tempTwo);

        if (biggestSum == numbersSum) {
            System.out.printf("Biggest ASCII sum is:%d%n", numbersSum);
            System.out.printf("Combination of characters is:%s", numbersString);
        } else if (biggestSum == bigCharSum) {
            System.out.printf("Biggest ASCII sum is:%d%n", bigCharSum);
            System.out.printf("Combination of characters is:%s", bigString);
        } else if (biggestSum == smallCharSum) {
            System.out.printf("Biggest ASCII sum is:%d%n", smallCharSum);
            System.out.printf("Combination of characters is:%s", smalString);
        } else {
            System.out.printf("Biggest ASCII sum is:%d%n", otherSum);
            System.out.printf("Combination of characters is:%s", otherString);
        }
    }
}
