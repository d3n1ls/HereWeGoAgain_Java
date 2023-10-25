package Exam.x28August2016;

import java.util.Scanner;

public class x04_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;
        for (int i = 1; i <= days; i++) {
            int patient = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && untreatedPatients > treatedPatients) {
                doctors++;
            }
            if (patient < doctors) {
                treatedPatients += patient;
            } else {
                treatedPatients += doctors;
                untreatedPatients += (patient - doctors);
            }
        }
        System.out.println("Treated patients: " + treatedPatients + ".");
        System.out.println("Untreated patients: " + untreatedPatients + ".");
    }
}
