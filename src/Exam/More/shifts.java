package Exam.More;

import java.util.Scanner;

public class shifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int br=0;
        for (int i=a; i<=8; i++){
            for(int k=9;k>=b;k--){
                for(int f=c;f<=8;f++){
                    for(int l=9;l>=d;l--){
                        if(i%2==0 && k%2==1 && f%2==0 && l%2==1 && (i!=f || k!=l)){
                            System.out.printf("%d%d - %d%d",i,k,f,l);
                            System.out.println();
                            br++;
                            if(br==6){
                                return;
                            }
                        }
                        else if(i%2==0 && k%2==1 && f%2==0 && l%2==1 && i==f && k==l){
                            System.out.println("Cannot change the same player.");

                        }

                    }
                }
            }

        }
    }
}
