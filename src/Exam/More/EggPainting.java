package Exam.More;

import java.util.Scanner;

public class EggPainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String size = scan.nextLine();
        String colour = scan.nextLine();
        int batchCount = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        double expenses = 0;
        if(size.equals("Large")){
            if(colour.equals("Red")){
                price = 16;
            }else if(colour.equals("Green")){
                price = 12;
            }else if(colour.equals("Yellow")){
                price = 9;
            }
        }
        else if(size.equals("Medium")){
            if(colour.equals("Red")){
                price = 13;
            }else if(colour.equals("Green")){
                price = 9;
            }else if(colour.equals("Yellow")){
                price = 7;
            }
        }
        else if(size.equals("Small")){
            if(colour.equals("Red")){
                price = 9;
            }else if(colour.equals("Green")){
                price =8;
            }else if(colour.equals("Yellow")){
                price = 5;
            }
        }
        expenses = 0.35 * (price * batchCount);
        System.out.printf("%.2f leva.",(price * batchCount) - expenses);
    }
}
