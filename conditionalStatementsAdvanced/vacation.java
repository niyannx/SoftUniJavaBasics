package conditionalStatementsAdvanced;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String type, location;
        double price;

        if (season.equals("Summer")) {
            location = "Alaska";
        } else {
            location = "Morocco";
        }

        if (budget <= 1000) {
            type = "Camp";
            if (season.equals("Summer")) {
                price = budget * 0.65;
            } else {
                price = budget * 0.45;
            }
        } else if (budget <= 3000) {
            type = "Hut";
            if (season.equals("Summer")) {
                price = budget * 0.80;
            } else {
                price = budget * 0.60;
            }
        } else {
            type = "Hotel";
            price = budget * 0.90;
        }

        System.out.printf("%s - %s - %.2f", location, type, price);
    }
}
