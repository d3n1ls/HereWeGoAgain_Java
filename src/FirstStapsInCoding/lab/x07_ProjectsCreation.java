package FirstStapsInCoding.lab;

import java.util.Scanner;

public class x07_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        if (projects <= 100 && projects > 0) {
            int numbers = projects * 3;
            System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, numbers, projects);
        } else {
            System.out.println("Projects interval 0-100!");
        }
    }
}
