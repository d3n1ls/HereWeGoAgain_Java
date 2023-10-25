package NestedLoops.lab;

public class x01_Clock {
    public static void main(String[] args) {
        //часове от 0 до 23
        for (int hour = 0; hour <= 23; hour++) {
            //минута от 0 до 59
            for (int minute = 0; minute <= 59; minute++) {
                System.out.println(hour + ":" + minute);
            }
        }
    }
}

