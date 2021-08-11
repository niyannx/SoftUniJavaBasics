package conditionalStatementsAdvanced;

import java.util.Scanner;

public class matchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine();
        int people = Integer.parseInt(scan.nextLine());
        double transport;
        double priceTickets;

        if (people < 5) {
            transport = 0.75;
        } else if (people < 10) {
            transport = 0.6;
        } else if (people < 25) {
            transport = 0.5;
        } else if (people < 50) {
            transport = 0.4;
        } else {
            transport = 0.25;
        }

        transport = budget * transport;
        budget = budget - transport;

        if (category.equals("VIP")) {
            priceTickets = 499.99 * people;
        } else {
            priceTickets = 249.99 * people;
        }

        if (budget > priceTickets) {
            System.out.printf("Yes! You have %.2f leva left.", budget - priceTickets);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", priceTickets - budget);
        }
    }
}
