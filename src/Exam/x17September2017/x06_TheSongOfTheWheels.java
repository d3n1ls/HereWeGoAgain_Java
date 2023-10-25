package Exam.x17September2017;

import java.util.Scanner;

public class x06_TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String pass = "";
        int counter = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (i < j && k > l) {
                            if (i * j + k * l == n) {
                                counter++;
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                                if (counter == 4) {
                                    pass = i + "" + j + "" + k + "" + l + "";
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        if (pass.equals("")) {
            System.out.printf("No!");
        } else {
            System.out.println("Password: " + pass);
        }
    }
}
