import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println(word.length());
        //Първи символ
        char firstSymbol = word.charAt(0);
        System.out.println(firstSymbol);
        //Последен символ
        char lastSymbol = word.charAt(word.length() - 1);
        System.out.println(lastSymbol);
    }
}
