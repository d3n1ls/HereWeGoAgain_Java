package NestedLoops.lab;

import java.util.Scanner;

public class x03_Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //всички комбинации от три числа -> 0 до n
        int count = 0; //броя на валидни комбинации
        for (int x1 = 0; x1 <= n; x1++) {
            for (int x2 = 0; x2 <= n; x2++) {
                for (int x3 = 0; x3 <= n; x3++) {
                    //всички комбинации -> x1 x2 x3
                    //валидни комбинации
                    //x1 + x2 + x3 == n
                    if (x1 + x2 + x3 == n) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
