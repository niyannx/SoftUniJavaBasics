package ExamJuly2019;

import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int videoCards = Integer.parseInt(scan.nextLine());
        int processors = Integer.parseInt(scan.nextLine());
        int RAM = Integer.parseInt(scan.nextLine());

        double priceVideoCards = videoCards * 250;
        double priceProcessors = priceVideoCards * 0.35;
        double priceRAM = priceVideoCards * 0.1;

        double price = priceVideoCards + processors * priceProcessors + RAM * priceRAM;

        if (videoCards > processors) {
            price = price - price * 0.15;
        }

        if (budget >= price) {
            System.out.printf("You have %.2f leva left!", Math.abs(budget - price));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - price));
        }
    }
}
