package Exam.x23July2017;

import java.util.Scanner;

public class x06_GroupName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char greater = scanner.nextLine().charAt(0);
        char smaller1 = scanner.nextLine().charAt(0);
        char smaller2 = scanner.nextLine().charAt(0);
        char smaller3 = scanner.nextLine().charAt(0);
        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;
        for (char i = 'A'; i <= greater; i++) {
            for (char j = 'a'; j <= smaller1; j++) {
                for (char k = 'a'; k <= smaller2; k++) {
                    for (char l = 'a'; l <= smaller3; l++) {
                        for (int m = 0; m <= n; m++) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count - 1);
    }
}
