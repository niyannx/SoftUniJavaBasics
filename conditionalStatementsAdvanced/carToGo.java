package conditionalStatementsAdvanced;

import java.util.Scanner;

public class carToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String classCar;
        String car;
        double price;

        if (budget <= 100) {
            classCar = "Economy class";
            if (season.equals("Summer")) {
                car = "Cabrio";
                price = budget * 0.35;
            } else {
                car = "Jeep";
                price = budget * 0.65;
            }
        } else if (budget <= 500) {
            classCar = "Compact class";
            if (season.equals("Summer")) {
                car = "Cabrio";
                price = budget * 0.45;
            } else {
                car = "Jeep";
                price = budget * 0.80;
            }
        } else {
            classCar = "Luxury class";
            car = "Jeep";
            price = budget * 0.90;
        }
        System.out.printf("%s\n%s - %.2f", classCar, car, price);
    }
}
