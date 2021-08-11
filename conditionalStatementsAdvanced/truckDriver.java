package conditionalStatementsAdvanced;

import java.util.Scanner;

public class truckDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        double kmMonth = Double.parseDouble(scan.nextLine());
        double perKm;

        if (kmMonth <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                perKm = 0.75;
            } else if (season.equals("Summer")) {
                perKm = 0.9;
            } else {
                perKm = 1.05;
            }
        } else if (kmMonth <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                perKm = 0.95;
            } else if (season.equals("Summer")) {
                perKm = 1.10;
            } else {
                perKm = 1.25;
            }
        } else {
            perKm = 1.45;
        }

        double profit = kmMonth * perKm * 4;
        profit = profit - profit * 0.1;

        System.out.printf("%.2f", profit);
    }
}
