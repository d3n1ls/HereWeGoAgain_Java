package Exam.More;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = Double.parseDouble(scanner.nextLine());
        int meseci = Integer.parseInt(scanner.nextLine());
        double simple= s+meseci*s*0.03;
        double slojna=s;
        for(int i=0;i<meseci;i++){
            slojna=slojna*1.027;
        }
        System.out.printf("Simple interest rate: %.2f lv.",simple);
        System.out.println();
        System.out.printf("Complex interest rate: %.2f lv.",slojna);
        System.out.println();
        if(simple>slojna){
            System.out.printf("Choose a simple interest rate. You will win %.2f lv.",simple-slojna);
        }
        else if(slojna>simple){
            System.out.printf("Choose a complex interest rate. You will win %.2f lv.",slojna-simple);
        }


    }
}
