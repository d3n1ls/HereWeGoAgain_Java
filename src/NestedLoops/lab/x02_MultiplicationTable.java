package NestedLoops.lab;

public class x02_MultiplicationTable {
    public static void main(String[] args) {
        //първия множител от 1 до 10
        for (int first = 1; first <= 10; first++) {
            //втори множител от 1 до 10
            for (int second = 1; second <= 10; second++) {
                System.out.printf("%d * %d = %d%n", first, second, first * second);
            }
        }
    }
}
