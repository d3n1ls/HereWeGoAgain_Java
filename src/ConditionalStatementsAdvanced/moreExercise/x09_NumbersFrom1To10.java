package ConditionalStatementsAdvanced.moreExercise;

public class x09_NumbersFrom1To10 {
    public static void main(String[] args) {

        int a = 1;

        while (true) {
            if (a > 10) {
                break;
            }
            System.out.println(a);
            a++;
        }
    }
}
