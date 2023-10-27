import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek) {
            case "Monday":
            case "1":
                System.out.println("Monday");
                break;
            case "Tuesday":
            case "2":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
            case "3":
                System.out.println("Wednesday");
                break;
            case "Thursday":
            case "4":
                System.out.println("Thursday");
                break;
            case "Friday":
            case "5":
                System.out.println("Friday");
                break;
            case "Saturday":
            case "6":
                System.out.println("Saturday");
                break;
            case "Sunday":
            case "7":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
