package Exam.x6And7July2019;

import java.util.Scanner;

public class x06_TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mostPowerfulWord = "";
        int maxPoints = Integer.MIN_VALUE;

        while (true) {
            String word = scanner.nextLine();

            if (word.equals("End of words")) {
                break;
            }
            int wordPower = 0;

            for (int i = 0; i < word.length(); i++) {
                wordPower += word.charAt(i);
            }
            String firstLetter = String.valueOf(word.charAt(0)).toLowerCase();

            switch (firstLetter) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "y":
                    wordPower *= word.length();
                    break;
                default:
                    wordPower = (int) Math.floor(wordPower / word.length());
                    break;
            }
            if (wordPower > maxPoints) {
                maxPoints = wordPower;
                mostPowerfulWord = word;
            }
        }
        System.out.printf("The most powerful word is %s - %d", mostPowerfulWord, maxPoints);
    }
}
