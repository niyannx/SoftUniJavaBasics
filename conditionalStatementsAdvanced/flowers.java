package conditionalStatementsAdvanced;

import java.util.Scanner;

public class flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int tulips = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        String holiday = scan.nextLine();
        double additionalCharge = 0;
        double discount1 = 0;
        double discount2 = 0;
        double discount3 = 0;
        double chrysanthemumsCost, rosesCost, tulipsCost;

        if (season.equals("Spring") || season.equals("Summer")) {
            chrysanthemumsCost = 2;
            rosesCost = 4.1;
            tulipsCost = 2.5;
        } else {
            chrysanthemumsCost = 3.75;
            rosesCost = 4.5;
            tulipsCost = 4.15;
        }

        if (holiday.equals("Y")) {
            additionalCharge = 0.15;

        }

        if (tulips > 7 && season.equals("Spring")) {
            discount1 = 0.05;
        }
        if (roses >= 10 && season.equals("Winter")) {
            discount2 = 0.10;
        }
        if (roses + chrysanthemums + tulips > 20) {
            discount3 = 0.20;
        }

        double normalCost = chrysanthemums * chrysanthemumsCost + roses * rosesCost + tulipsCost * tulips;
        double overallCost = normalCost + normalCost * additionalCharge;
        overallCost = overallCost - overallCost * discount1;
        overallCost = overallCost - overallCost * discount2;
        overallCost = overallCost - overallCost * discount3;
        overallCost = overallCost + 2;

        System.out.printf("%.2f", overallCost);
    }
}
