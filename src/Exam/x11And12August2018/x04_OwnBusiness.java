package Exam.x11And12August2018;

import java.util.Scanner;

public class x04_OwnBusiness {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int freeSpaceWidth = Integer.parseInt(scan.nextLine());
        int freeSpaceLength = Integer.parseInt(scan.nextLine());
        int freeSpaceHeight = Integer.parseInt(scan.nextLine());

        int freeSpaceTotal = freeSpaceWidth * freeSpaceLength * freeSpaceHeight;
        int result = 0;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("Done")) {
                break;
            }
            int computers = Integer.parseInt(input);
            result += computers;
            if (result > freeSpaceTotal) {
                System.out.printf("No more free space! You need %d Cubic meters more.", result - freeSpaceTotal);
                break;
            }
        }
        if (freeSpaceTotal >= result)
            System.out.printf("%d Cubic meters left.", freeSpaceTotal - result);
    }
}
