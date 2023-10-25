package ForLoop.мoreExercises;

import java.util.Scanner;

public class x02_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());

        int doctorsCount = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= daysCount; i++) {
            int newPatients = Integer.parseInt(scanner.nextLine());

            if ((i % 3 == 0) && (untreatedPatients > treatedPatients)) {
                doctorsCount++;
            }
            if (newPatients <= doctorsCount) {
                treatedPatients += newPatients;
            } else {
                treatedPatients += doctorsCount;
                untreatedPatients += newPatients - doctorsCount;
            }
        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
