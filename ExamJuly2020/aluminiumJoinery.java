package ExamJuly2020;

import java.util.Scanner;

public class aluminiumJoinery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amount = Integer.parseInt(scan.nextLine());
        String size = scan.nextLine();
        String delivery = scan.nextLine();
        double price = 0;

        if (amount < 10) {
            System.out.println("Invalid order");
            return;
        }

        switch (size) {
            case "90X130":
                price = 110 * amount;
                if (amount > 60) {
                    price = price - price * 0.08;
                } else if (amount > 30) {
                    price = price - price * 0.05;
                }
                break;
            case "100X150":
                price = 140 * amount;
                if (amount > 80) {
                    price = price - price * 0.1;
                } else if (amount > 40) {
                    price = price - price * 0.06;
                }
                break;
            case "130X180":
                price = 190 * amount;
                if (amount > 50) {
                    price = price - price * 0.12;
                } else if (amount > 20) {
                    price = price - price * 0.07;
                }
                break;
            case "200X300":
                price = 250 * amount;
                if (amount > 50) {
                    price = price - price * 0.14;
                } else if (amount > 25) {
                    price = price - price * 0.09;
                }
                break;
        }
        if (delivery.equals("With delivery")) {
            price = price + 60;
        }
        if (amount > 99) {
            price = price - price * 0.04;
        }
        System.out.printf("%.2f BGN", price);
    }
}
