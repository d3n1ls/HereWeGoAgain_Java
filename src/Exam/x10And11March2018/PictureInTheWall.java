package Exam.x10And11March2018;

import java.util.Scanner;

public class PictureInTheWall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wallHoleWidth = Integer.parseInt(scanner.nextLine());
        int wallHoleHeight = Integer.parseInt(scanner.nextLine());
        int pictureWidth = Integer.parseInt(scanner.nextLine());
        int pictureCount = Integer.parseInt(scanner.nextLine());

        int wallHoleArea = wallHoleHeight * wallHoleWidth;
        int pictureArea = (pictureWidth * pictureWidth) * pictureCount;

        int diff = Math.abs(wallHoleArea - pictureArea);
        if (wallHoleArea < pictureArea) {
            System.out.print("The pictures don't fit in the hole. ");
            System.out.printf("Picture area is %d bigger than hole area.", diff);
        } else {
            System.out.print("The pictures fit in the hole. ");
            System.out.printf("Hole area is %d bigger than pictures area.", diff);
        }
    }
}
