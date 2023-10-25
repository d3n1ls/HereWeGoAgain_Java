package Exam.x20And21April2019;

import java.util.Scanner;

public class x01_EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBread = Integer.parseInt(scanner.nextLine());
        int packetEggs = Integer.parseInt(scanner.nextLine());
        int kgCookies = Integer.parseInt(scanner.nextLine());

        double sumOfBreads = (easterBread * 1.0) * 3.20;
        double sumOfcookies = (kgCookies * 1.0) * 5.40;
        double sumPaintEggs = (packetEggs * 1.0) * 12 * 0.15;
        double sumOfEggsOnly = (packetEggs * 1.0) * 4.35;

        double allSum = sumOfBreads + sumOfcookies + sumPaintEggs + sumOfEggsOnly;

        System.out.printf("%.2f", allSum);
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

            /*
            Изчисляваме общата цена за всичко, като съберем:
            цената за килограм брашно умножена по килограмите брашно
            цената за килограм захар умножена килограмите захар
            цената за една кора яйца умножена по броя на корите яйца
            цената за един пакен мая умножена по броя на пакетите мая
             */

//Console.WriteLine($"{totalPrice:F2}");


