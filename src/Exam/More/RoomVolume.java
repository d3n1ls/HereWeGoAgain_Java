package Exam.More;

import java.util.Scanner;

public class RoomVolume {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int roomVolume = width * length * height;
        int totalBoxVol = 0;

        String input = scan.nextLine();

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);

            totalBoxVol += boxes;

            if (totalBoxVol > roomVolume) {
                break;
            }

            input = scan.nextLine();
        }

        if (totalBoxVol > roomVolume) {
            System.out.printf("No more free space! You need %d Cubic meters more.", totalBoxVol - roomVolume);
        } else {
            System.out.printf("%d Cubic meters left.", roomVolume - totalBoxVol);
        }
    }
}
