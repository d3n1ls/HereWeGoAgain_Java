package WhileLoop.moreExercises;

public class x04_NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            i++;
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

