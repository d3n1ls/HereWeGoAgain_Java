package Exam.More;

import java.util.Scanner;

public class Luggage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double obshtoobem=0;
        int br=0;
        while(true){
            String s = scanner.nextLine();
            if(s.equals("End")){
                break;
            }
            double kufar = Double.parseDouble(s);
            br++;
            if(br%3==0){
                kufar=kufar*1.1;
            }
            obshtoobem+=kufar;
            if(obshtoobem>a){
                System.out.println("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.",br-1);
                break;

            }

        }
        if(a>=obshtoobem){
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.",br);

        }


    }
}
