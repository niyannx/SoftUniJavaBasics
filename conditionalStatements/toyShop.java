package conditionalStatements;

import java.util.Scanner;

public class toyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double costOfTrip = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        int allToys = puzzles + dolls + bears + minions + trucks;
        double cost = puzzles * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;

        if (allToys >= 50) {
            double discount =  cost * 0.25;
            cost = cost - discount;
        }
        double rent = cost * 0.10;
        cost = cost - rent;

        if (cost >= costOfTrip) {
            double profit = cost - costOfTrip;
            System.out.printf("Yes! %.2f lv left.", profit);
        }
        if (cost < costOfTrip) {
            double shortage = costOfTrip - cost;
            System.out.printf("Not enough money! %.2f lv needed.", shortage);
        }
    }
}