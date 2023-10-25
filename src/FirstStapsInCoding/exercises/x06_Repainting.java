package FirstStapsInCoding.exercises;

import java.util.Scanner;

public class x06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int paintThinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double nylonSum = (nylon + 2) * 1.50;
        double paintSum = paint * 1.10 * 14.50;
        double paintThinnerSum = paintThinner * 5.00;
        double materials = nylonSum + paintSum + paintThinnerSum + 0.40;
        double workersSum = materials * 0.30 * hours;
        double total = materials + workersSum;
        System.out.println(total);
    }
}
