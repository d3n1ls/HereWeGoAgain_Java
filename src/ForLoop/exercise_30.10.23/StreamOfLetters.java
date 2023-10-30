import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Отпечатваме всеки симвул
        // Всички позиции от 0 до последната
        // Повтарям - Взема символа на позициата и отпечатва
        // Началната стойност е 0
        // Последната позиция е дължината-1
        // Ппомяна -  +1

        for (int position = 0; position <= text.length() - 1; position++) {
            char currentSymbol = text.charAt(position);
            System.out.println(currentSymbol);
        }
    }
}
