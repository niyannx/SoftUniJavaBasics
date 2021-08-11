package conditionalStatements;

import java.util.Scanner;

public class fuelTankPt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeFuel = scan.nextLine();
        double amount = Double.parseDouble(scan.nextLine());
        String map = scan.nextLine();
        double discount = 0;
        double discount2 = 0;
        double price;

        if (typeFuel.equals("Gasoline")) {
            price = 2.22;
        } else if (typeFuel.equals("Diesel")) {
            price = 2.33;
        } else {
            price = 0.93;
        }

        if (map.equals("Yes")) {
            if (typeFuel.equals("Gasoline")) {
                discount = 0.18;
            } else if (typeFuel.equals("Diesel")) {
                discount = 0.12;
            } else {
                discount = 0.08;
            }
        }

        if (amount <= 25 && amount >= 20) {
            discount2 = 0.08;
        } else if (amount > 25) {
            discount2 = 0.1;
        }
        double overallPrice = (price * amount - discount * amount) - (price * amount - discount * amount) * discount2;

        System.out.printf("%.2f lv.", overallPrice);
    }
}
