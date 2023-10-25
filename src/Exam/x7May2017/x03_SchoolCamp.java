package Exam.x7May2017;

import java.util.Scanner;

public class x03_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String boysOrGirls = scanner.nextLine();
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());

        double priceAllNight = 0.0;
        String sport = "";

        switch (season) {
            case "Winter":
                if ("boys".equalsIgnoreCase(boysOrGirls)) {
                    priceAllNight = countStudents * countNights * 9.60;
                    sport = "Judo";
                } else if ("girls".equalsIgnoreCase(boysOrGirls)) {
                    priceAllNight = countStudents * countNights * 9.60;
                    sport = "Gymnastics";
                } else {
                    priceAllNight = countStudents * countNights * 10.00;
                    sport = "Ski";
                }
                break;
            case "Spring":
                if ("boys".equalsIgnoreCase(boysOrGirls)) {
                    priceAllNight = countStudents * countNights * 7.20;
                    sport = "Tennis";
                } else if ("girls".equalsIgnoreCase(boysOrGirls)) {
                    priceAllNight = countStudents * countNights * 7.20;
                    sport = "Athletics";
                } else {
                    priceAllNight = countStudents * countNights * 9.50;
                    sport = "Cycling";
                }
                break;
            case "Summer":
                if ("boys".equalsIgnoreCase(boysOrGirls)) {
                    priceAllNight = countStudents * countNights * 15.00;
                    sport = "Football";
                } else if ("girls".equalsIgnoreCase(boysOrGirls)) {
                    priceAllNight = countStudents * countNights * 15.00;
                    sport = "Volleyball";
                } else {
                    priceAllNight = countStudents * countNights * 20.00;
                    sport = "Swimming";
                }
                break;
        }
        double plusDiscount = 0.0;

        if (countStudents <= 9) {
            plusDiscount = priceAllNight;
        } else if (countStudents < 20) {
            plusDiscount = priceAllNight - (priceAllNight * 0.05);
        } else if (countStudents < 50) {
            plusDiscount = priceAllNight - (priceAllNight * 0.15);
        } else {
            plusDiscount = priceAllNight - (priceAllNight * 0.5);
        }
        System.out.printf("%s %.2f lv.", sport, plusDiscount);
    }
}
