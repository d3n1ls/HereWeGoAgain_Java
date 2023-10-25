package Exam.x9And10March2019;

import java.util.Scanner;

public class x05_FitnessCenter01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int back = 0;
        int chests = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        int workout = 0;
        int protein = 0;

        for (int i = 1; i <= people; i++) {
            String activity = scanner.nextLine();
            if (activity.equals("Back")) {
                workout++;
                back++;
            } else if (activity.equals("Chest")) {
                workout++;
                chests++;
            } else if (activity.equals("Legs")) {
                workout++;
                legs++;
            } else if (activity.equals("Abs")) {
                workout++;
                abs++;
            } else if (activity.equals("Protein shake")) {
                protein++;
                proteinShake++;
            } else if (activity.equals("Protein bar")) {
                proteinBar++;
                protein++;
            }
        }
        System.out.printf("%d - back\n", back);
        System.out.printf("%d - chest\n", chests);
        System.out.printf("%d - legs\n", legs);
        System.out.printf("%d - abs\n", abs);
        System.out.printf("%d - protein shake\n", proteinShake);
        System.out.printf("%d - protein bar\n", proteinBar);
        System.out.printf("%.2f%% - work out\n", workout * 1.0 / people * 100);
        System.out.printf("%.2f%% - protein", protein * 1.0 / people * 100);
    }
}
