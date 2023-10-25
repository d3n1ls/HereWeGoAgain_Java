package WhileLoop.exercises;

import java.util.Scanner;

public class x03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int countSpend = 0;
        int countDays = 0;

        while (availableMoney < neededMoney && countSpend < 5) {
            String typeOfAction = scanner.nextLine();
            double momentMoney = Double.parseDouble(scanner.nextLine());
            countDays++;

            switch (typeOfAction) {
                case "spend":
                    availableMoney -= momentMoney;
                    countSpend++;
                    if (availableMoney < 0) {
                        availableMoney = 0;
                    }
                    break;
                case "save":
                    availableMoney += momentMoney;
                    countSpend = 0;
                    break;
            }
        }
        if (countSpend == 5) {
            System.out.printf("You can't save the money.\n%d", countDays);
        }
        if (availableMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
