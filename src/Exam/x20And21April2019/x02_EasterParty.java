package Exam.x20And21April2019;

import java.util.Scanner;

public class x02_EasterParty {
    public static void main(String[] args) {
        //Между 10 (вкл.) и 15 (вкл.) човека -> 15 % отстъпка от куверта за един човек
        //Между 15 и 20 (вкл.) човека -> 20 % отстъпка от куверта за един човек
        //Над 20 човека -> 25 % отстъпка от куверта за един човек
        Scanner scan = new Scanner(System.in);
        int guests = Integer.parseInt(scan.nextLine());
        double guestCost = Double.parseDouble(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        if (guests >=10 && guests<=15) {
            guestCost = 0.85 * guestCost;
        } if (guests > 15 && guests <= 20) {
            guestCost = 0.80 * guestCost;
        } if (guests > 20)
            guestCost = 0.75*guestCost;
        double cakePrice = 0.10*budget;
        double total = (guestCost * guests) + cakePrice;
        if (budget > total)
            System.out.printf("It is party time! %.2f leva left.",budget-total);
        else if (total>budget)
            System.out.printf("No party! %.2f leva needed.",total-budget);

    }
}
    /*
    int guests = int.Parse(Console.ReadLine()); // гости
            double pricePerPerson = double.Parse(Console.ReadLine()); //куверт
            double budget = double.Parse(Console.ReadLine()); // бюджет


            //ако гостите са повече от 10 (вкл.) до 15 (вкл.) -> 15% отстъпка
            //ако гостите са повече от 15 до 20 (вкл.) -> 20% отстъпка
            //ако гостите са повече от 20 -> 25% отстъпка
            if (guests >= 10 && guests <= 15)
            {
                pricePerPerson = 0.85 * pricePerPerson;
            }
            else if (guests > 15 && guests <= 20)
            {
                pricePerPerson = 0.8 * pricePerPerson;

            }
            else if (guests > 20)
            {
                pricePerPerson = 0.75 * pricePerPerson;
            }

            //цена на тортата -> 10 % от бюджета
            double cakePrice = 0.1 * budget;

            double totalPrice = guests * pricePerPerson + cakePrice;

            if (totalPrice <= budget)
            {
                Console.WriteLine($"It is party time! {budget - totalPrice:F2} leva left.");
            }
            else
            {
                Console.WriteLine($"No party! {totalPrice - budget:F2} leva needed.");
     */

