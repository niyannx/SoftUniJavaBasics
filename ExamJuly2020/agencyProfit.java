package ExamJuly2020;

import java.util.Scanner;

public class agencyProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String companyName = scan.nextLine();
        int adultTickets = Integer.parseInt(scan.nextLine());
        int kidsTickets = Integer.parseInt(scan.nextLine());
        double priceAdult = Double.parseDouble(scan.nextLine());
        double serviceFee = Double.parseDouble(scan.nextLine());
        double priceKids = priceAdult - priceAdult * 0.7;
        double price = (priceAdult + serviceFee) * adultTickets + (priceKids + serviceFee) * kidsTickets;
        double profit = price * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", companyName, profit);

    }
}
