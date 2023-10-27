import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());

        if(num1 % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }
}
