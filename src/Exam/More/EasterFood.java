package Exam.More;

import java.util.Scanner;

public class EasterFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int zahar = Integer.parseInt(scanner.nextLine());
        int kozunak = Integer.parseInt(scanner.nextLine());
        int zaharmax= Integer.MIN_VALUE;
        int kozunakmax=Integer.MIN_VALUE;
        double broizahar=0;
        double broikozunak=0;
        double zaharobshto=0;
        double kozunakobshto=0;
        int br=0;
        while(true) {
            if (zaharmax < zahar) {
                zaharmax = zahar;
            }
            if (kozunakmax < kozunak) {
                kozunakmax = kozunak;
            }

            zaharobshto += zahar;
            kozunakobshto += kozunak;
            br++;
            if (br == a) {
                break;
            }
            zahar = Integer.parseInt(scanner.nextLine());
            kozunak = Integer.parseInt(scanner.nextLine());


        }
        double ss=Math.ceil(zaharobshto/950);
        double kk=Math.ceil(kozunakobshto/750);
        System.out.printf("Sugar: %.0f",ss);
        System.out.println();
        System.out.printf("Flour: %.0f",kk);
        System.out.println();
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",kozunakmax,zaharmax);
    }
}
