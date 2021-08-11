package ExamApril2019;

import java.util.Scanner;

public class godzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int extras = Integer.parseInt(scan.nextLine());
        double priceClothing = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.1;

        if (extras >= 150) {
            priceClothing = priceClothing - priceClothing * 0.1;
        }
        double overallPrice = priceClothing * extras + decor;

        if (overallPrice > budget) {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", Math.abs(overallPrice - budget));
        } else {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", Math.abs(overallPrice - budget));
        }
    }
}
