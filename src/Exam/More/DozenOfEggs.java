package Exam.More;

import java.util.Scanner;

public class DozenOfEggs {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int eggs = 0;

        for (int i = 0; i < 7; i++) {
            String[] daily = scn.nextLine().split(" ");
            eggs += (daily[1].equals("eggs") ? Integer.parseInt(daily[0])
                    : Integer.parseInt(daily[0]) * 12);

        }
        int dozens = (int)Math.floor(eggs / 12);
        eggs= eggs%12;

        System.out.printf("%d dozens + %d eggs",dozens, eggs);
    }
}
