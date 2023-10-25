package Exam.x18And19July2020;

import java.util.Scanner;

public class x06_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = String.valueOf(start).charAt(0); i <= String.valueOf(end).charAt(0); i++) {
            for (int j = String.valueOf(start).charAt(1); j <= String.valueOf(end).charAt(1); j++) {
                for (int k = String.valueOf(start).charAt(2); k <= String.valueOf(end).charAt(2); k++) {
                    for (int l = String.valueOf(start).charAt(3); l <= String.valueOf(end).charAt(3); l++) {
                        if ((i % 2 != 0) && (j % 2 != 0) && (k % 2 != 0) && (l % 2 != 0)) {
                            sb.append(String.format("%c%c%c%c", (char) i, (char) j, (char) k, (char) l) + " ");
                        }
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
