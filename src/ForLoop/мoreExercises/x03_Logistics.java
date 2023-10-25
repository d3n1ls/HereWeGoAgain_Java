package ForLoop.мoreExercises;

import java.util.Scanner;

public class x03_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loadsNumber = Integer.parseInt(scanner.nextLine());

        int totalTonnage = 0;
        int minibusTonnage = 0;
        int truckTonnage = 0;
        int trainTonnage = 0;

        for (int i = 0; i < loadsNumber; i++) {
            int loadTonnage = Integer.parseInt(scanner.nextLine());

            totalTonnage += loadTonnage;

            if (loadTonnage <= 3) {
                minibusTonnage += loadTonnage;
            } else if (loadTonnage <= 11) {
                truckTonnage += loadTonnage;
            } else {
                trainTonnage += loadTonnage;
            }
        }
        System.out.printf("%.2f%n", (minibusTonnage * 200.0 + truckTonnage * 175 + trainTonnage * 120) / totalTonnage);
        System.out.printf("%.2f%%%n", minibusTonnage * 1.0 / totalTonnage * 100);
        System.out.printf("%.2f%%%n", truckTonnage * 1.0 / totalTonnage * 100);
        System.out.printf("%.2f%%", trainTonnage * 1.0 / totalTonnage * 100);
    }
}
