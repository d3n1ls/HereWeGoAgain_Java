package Exam.More;

import java.util.Scanner;

public class Easter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        int i=0;
        double obshto=0;
        int br=0;
        double avg=0;
        while(i<a){
            while(true){
                if(s.equals("Finish")){
                    if(br%2==0){
                        obshto=0.8*obshto;
                    }
                    System.out.printf("You purchased %d items for %.2f leva.",br,obshto);
                    System.out.println();
                    break;
                }
                else if(s.equals("basket")){
                    obshto+=1.5;
                    br++;
                }
                else if(s.equals("wreath")){
                    obshto+=3.8;
                    br++;
                }
                else if(s.equals("chocolate bunny")){
                    obshto+=7;
                    br++;
                }
                s = scanner.nextLine();
            }
            i++;
            br=0;
            avg+=obshto;
            obshto=0;
            s = scanner.nextLine();

        }
        double average= avg/a;
        System.out.printf("Average bill per client is: %.2f leva.",average);
    }
}
