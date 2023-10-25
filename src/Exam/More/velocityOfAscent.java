package Exam.More;

import java.util.Scanner;

public class velocityOfAscent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rekord = Double.parseDouble(scanner.nextLine());
        double s = Double.parseDouble(scanner.nextLine());
        double t = Double.parseDouble(scanner.nextLine());
        double puti=Math.floor(s/50);
        double vreme=t*s+puti*30;

        if(vreme<rekord){
            System.out.printf("Yes! The new record is %.2f seconds.",vreme);
        }
        else{
            double baven=vreme-rekord;
            System.out.printf("No! He was %.2f seconds slower.",baven);
        }
    }
}
