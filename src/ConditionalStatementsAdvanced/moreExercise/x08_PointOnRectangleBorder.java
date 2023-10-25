package ConditionalStatementsAdvanced.moreExercise;

import java.util.Scanner;

public class x08_PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double x1 = Double.parseDouble(sca.nextLine());
        double y1 = Double.parseDouble(sca.nextLine());
        double x2 = Double.parseDouble(sca.nextLine());
        double y2 = Double.parseDouble(sca.nextLine());
        double x = Double.parseDouble(sca.nextLine());
        double y = Double.parseDouble(sca.nextLine());

        boolean firstCondition = (x == x1 || x == x2) && (y >= y1 && y <= y2);
        boolean secondCondition = (y == y1 || y == y2) && (x >= x1 && x <= x2);

        if (firstCondition || secondCondition) {
            System.out.println("Border");
        } else System.out.println("Inside / Outside");
    }
}
