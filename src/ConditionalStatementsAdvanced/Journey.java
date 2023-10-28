import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double spentMoney = 0;
        String place = "";
        String type = "";

        if (budget <= 100) {
            place = "Bulgaria";
            if (season.equals("Summer")) {
                spentMoney = budget - (budget * (1 - 0.3));
                type = "Camping";
            } else if (season.equals("Winter")) {
                spentMoney = budget - (budget * (1 - 0.7));
                type = "Hotel";
            }
        }else if(budget <= 1000){
            place = "Balkans";
            if (season.equals("Summer")){
                spentMoney = budget - budget * (1 - 0.4);
                type = "Camping";
            }else if (season.equals("Winter")){
                spentMoney = budget - (budget * (1- 0.8));
                type = "Hotel";
            }
        }else if(budget > 1000){
            place = "Europe";
            spentMoney = budget - (budget * (1 - 0.9));
            type = "Hotel";
        }
        System.out.printf("Somewhere in %s %n", place);
        System.out.printf("%s - %.2f", type, spentMoney);
    }
}
