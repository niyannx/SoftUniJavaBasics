package conditionalStatementsAdvanced;

import java.util.Scanner;

public class schoolCamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        String group = scan.nextLine();
        int students = Integer.parseInt(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        String sport;
        double price;
        double discount;

        if (season.equals("Winter")) {
            if (group.equals("girls")) {
                price = 9.6;
                sport = "Gymnastics";
            } else if (group.equals("boys")) {
                price = 9.6;
                sport = "Judo";
            } else {
                price = 10;
                sport = "Ski";
            }
        } else if (season.equals("Spring")) {
            if (group.equals("girls")) {
                price = 7.2;
                sport = "Athletics";
            } else if (group.equals("boys")) {
                price = 7.2;
                sport = "Tennis";
            } else {
                price = 9.5;
                sport = "Cycling";
            }
        } else {
            if (group.equals("girls")) {
                price = 15;
                sport = "Volleyball";
            } else if (group.equals("boys")) {
                price = 15;
                sport = "Football";
            } else {
                price = 20;
                sport = "Swimming";
            }
        }

        if (students >= 10 && students < 20) {
            discount = 0.05;
        } else if (students >= 20 && students < 50) {
            discount = 0.15;
        } else if (students >= 50) {
            discount = 0.5;
        } else {
            discount = 0;
        }

        price = price * nights * students;
        price = price - price * discount;

        System.out.printf("%s %.2f lv.", sport, price);

    }
}
