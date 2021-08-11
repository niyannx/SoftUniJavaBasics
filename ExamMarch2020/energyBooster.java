package ExamMarch2020;

import java.util.Scanner;

public class energyBooster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String type = scan.nextLine();
        int sets = Integer.parseInt(scan.nextLine());

        double discount = 0;
        double price = 0;

        if (type.equals("small")) {
            switch (fruit) {
                case "Watermelon":
                    price = 2 * 56;
                    break;
                case "Mango":
                    price = 2 * 36.66;
                    break;
                case "Pineapple":
                    price = 2 * 42.10;
                    break;
                case "Raspberry":
                    price = 2 * 20;
                    break;
            }
        } else {
            switch (fruit) {
                case "Watermelon":
                    price = 5 * 28.70;
                    break;
                case "Mango":
                    price = 5 * 19.60;
                    break;
                case "Pineapple":
                    price = 5 * 24.80;
                    break;
                case "Raspberry":
                    price = 5 * 15.20;
                    break;
            }
        }

        price = price * sets;
        if (price >= 400 && price <= 1000) {
            discount = 0.15;
        } else if (price > 1000) {
            discount = 0.50;
        }
        price = price - price * discount;
        System.out.printf("%.2f lv.", price);
    }
}
