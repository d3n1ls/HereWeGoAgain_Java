import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if (age >= 60) {
            System.out.println("Pensioner");
        } else if (age >= 40) {
            System.out.println("Chicak i Lelka");
        } else if (age >= 26) {
            System.out.println("teen");
        } else if (age >= 10) {
            System.out.println("po maluk teen");
        } else {
            System.out.println("baby");
        }
    }
}
