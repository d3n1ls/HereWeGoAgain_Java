package ForLoop.exercises;

import java.util.Scanner;

public class x06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int juryNum = Integer.parseInt(scanner.nextLine());

        double sumPoints = 0.0;

        for (int i = 1; i <= juryNum; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());

            int length = juryName.length();
            sumPoints += (length * juryPoints / 2);

            if ((sumPoints + academyPoints) > 1250.5) {
                break;
            }
        }
        sumPoints += academyPoints;
        if (sumPoints > 1250.5) {
            System.out.printf("%nCongratulations, %s got a nominee for leading role with %.1f!", name, sumPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - sumPoints);
        }
    }
}
