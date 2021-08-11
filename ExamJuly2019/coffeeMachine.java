package ExamJuly2019;

import java.util.Scanner;

public class coffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String drink = scan.nextLine();
        String sugar = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());

        double price = 0;

        if (drink.equals("Espresso")) {
            switch (sugar) {
                case "Without":
                    price = 0.9;
                    break;
                case "Normal":
                    price = 1;
                    break;
                case "Extra":
                    price = 1.2;
                    break;
            }
        } else if (drink.equals("Cappuccino")) {
            switch (sugar) {
                case "Without":
                    price = 1;
                    break;
                case "Normal":
                    price = 1.2;
                    break;
                case "Extra":
                    price = 1.6;
                    break;
            }
        } else {
            switch (sugar) {
                case "Without":
                    price = 0.5;
                    break;
                case "Normal":
                    price = 0.6;
                    break;
                case "Extra":
                    price = 0.7;
                    break;
            }
        }
        price = price * n;
        if (sugar.equals("Without")) {
            price = price - price * 0.35;
        }
        if (drink.equals("Espresso") && n >= 5) {
            price = price - price * 0.25;
        }
        if (price > 15) {
            price = price - price * 0.2;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", n, drink, price);
    }
}
