import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrise = 0.0;
        double apartmentPrise = 0.0;

        if (month.equals("May") || month.equals("October")) {
            studioPrise = 50.00;
            apartmentPrise = 65.00;
            if (nights > 14) {
                studioPrise = studioPrise - studioPrise * 0.30;
                apartmentPrise = apartmentPrise - apartmentPrise * 0.10;
            } else if (nights > 7) {
                studioPrise = studioPrise - studioPrise * 0.05;
                apartmentPrise = 65.00;
            } else {
                studioPrise = 50.00;
                apartmentPrise = 65.00;
            }
        } else if (month.equals("June") || month.equals("September")) {
            studioPrise = 75.20;
            apartmentPrise = 68.70;
            if (nights > 14) {
                studioPrise = studioPrise - studioPrise * 0.20;
                apartmentPrise = apartmentPrise - apartmentPrise * 0.10;
            }
        } else {
            studioPrise = 76.00;
            apartmentPrise = 77.00;
            if (nights > 14) {
                apartmentPrise = apartmentPrise - apartmentPrise * 0.10;
            } else {
                studioPrise = 76.00;
                apartmentPrise = 77.00;
            }
        }
        double totalStudioPrise = nights * studioPrise;
        double totalApartmentPrise = nights * apartmentPrise;
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", totalApartmentPrise, totalStudioPrise);
    }
}