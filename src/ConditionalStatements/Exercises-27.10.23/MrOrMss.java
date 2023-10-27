import java.util.Scanner;

public class MrOrMss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String sex = scanner.nextLine();
        if (age >= 16 && sex.equals("m")) {
            System.out.println("Mr.");
        } else if (age < 16 && sex.equals("m")) {
            System.out.println("Master");
        } else if (age >= 16 && sex.equals("f")) {
            System.out.println("Ms.");
        } else if (age < 16 && sex.equals("f")) {
            System.out.println("Miss");
        } else {
            System.out.println("error");
        }
    }
}
