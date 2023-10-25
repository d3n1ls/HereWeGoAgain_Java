package Exam.x3September2017;

import java.util.Scanner;

public class x04_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthCake = Integer.parseInt(scanner.nextLine());
        int lengthCake = Integer.parseInt(scanner.nextLine());

        int pieces = widthCake * lengthCake;

        for (int i = 0; i <= 1000; i++) {
            String takePieces = scanner.nextLine();

            if ("Stop".equalsIgnoreCase(takePieces)) {
                System.out.printf("%d pieces are left.", pieces);
                break;
            } else {
                pieces -= Integer.parseInt(takePieces);
                if (pieces < 0) {
                    System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
                    break;
                }
            }
        }
    }
}
