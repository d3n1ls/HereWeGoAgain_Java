package FirstStapsInCoding.exercises;

import java.util.Scanner;

public class x04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesForHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int totalPages = numberOfPages / pagesForHour;
        int hoursDay = totalPages / days;
        System.out.println(hoursDay);
    }
}
