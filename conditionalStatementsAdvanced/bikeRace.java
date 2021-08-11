package conditionalStatementsAdvanced;

import java.util.Scanner;

public class bikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int juniorBikers = Integer.parseInt(scan.nextLine());
        int seniorBikers = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        double juniorTax = 0;
        double seniorTax = 0;
        double discount = 0;

        switch (type) {
            case "trail":
                juniorTax = 5.5;
                seniorTax = 7;
                break;
            case "cross-country":
                if (juniorBikers + seniorBikers >= 50) {
                    juniorTax = 8 - 8 * 0.25;
                    seniorTax = 9.5 - 9.5 * 0.25;
                } else {
                    juniorTax = 8;
                    seniorTax = 9.5;
                }
                break;
            case "downhill":
                juniorTax = 12.25;
                seniorTax = 13.75;
                break;
            case "road":
                juniorTax = 20;
                seniorTax = 21.5;
                break;
        }
        double overallPrice = (juniorTax * juniorBikers + seniorTax * seniorBikers) - (juniorTax * juniorBikers + seniorTax * seniorBikers) * 0.05;

        System.out.printf("%.2f", overallPrice);
    }
}
