package Exam.x20And21April2019;

import java.util.Scanner;

public class x01_EasterBakery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double flourPrice = Double.parseDouble(scan.nextLine());
        double flourKg = Double.parseDouble(scan.nextLine());
        double sugarKg = Double.parseDouble(scan.nextLine());
        int kori = Integer.parseInt(scan.nextLine());
        int maia = Integer.parseInt(scan.nextLine());
        double sugarPrice = flourPrice * 0.75;
        double eggPrice = flourPrice * 1.1;
        double maiaPrice = sugarPrice * 0.2;
        double totalFlour = flourKg * flourPrice;
        double totalSugar = sugarKg * sugarPrice;
        double totalEgg = eggPrice * kori;
        double totalMaia = maia * maiaPrice;
        double totalPrice = totalFlour + totalSugar + totalEgg + totalMaia;
        System.out.printf("%.2f",totalPrice);

    }
}
/*
     double flourPricePerKg = double.Parse(Console.ReadLine()); // Прочитаме цената за килограм брашно
            double flourKg = double.Parse(Console.ReadLine()); // Прочитаме килограмите брашно
            double sugarKg = double.Parse(Console.ReadLine()); // Прочитаме килограмите захар
            int eggPacks = int.Parse(Console.ReadLine()); // Прочитаме броя на корите с яйца
            int yeastPacks = int.Parse(Console.ReadLine()); // Прочитаме броя на пакетите с мая

            double sugarPricePerKg = flourPricePerKg * 0.75; // Изчисляваме цената на килограм захар
            double eggsPricePerPack = flourPricePerKg * 1.1; // Изчисляваме цената на една кора яйца
            double yeastPricePerPack = sugarPricePerKg * 0.2; // Изчисляваме цената на един пакет мая

            double totalPrice = flourPricePerKg * flourKg +
                    sugarPricePerKg * sugarKg +
                    eggsPricePerPack * eggPacks +
                    yeastPricePerPack * yeastPacks;


            Изчисляваме общата цена за всичко, като съберем:
            цената за килограм брашно умножена по килограмите брашно
            цената за килограм захар умножена килограмите захар
            цената за една кора яйца умножена по броя на корите яйца
            цената за един пакен мая умножена по броя на пакетите мая


            Console.WriteLine($"{totalPrice:F2}");
     */

