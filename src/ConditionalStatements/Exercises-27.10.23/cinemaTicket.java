import java.util.Scanner;

public class cinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String day = scanner.nextLine();
        int price = 0;

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Friday":
                price = 12;
                break;
            case "Wednesday":
            case "Thursday":
                price = 14;
                break;
            case "Saturday":
            case "Sunday":
                price = 16;
        }
        System.out.println(price);
    }
}
