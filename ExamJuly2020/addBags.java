package ExamJuly2020;

import java.util.Scanner;

public class addBags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceAbove20 = Double.parseDouble(scan.nextLine());
        double kilograms = Double.parseDouble(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int bags = Integer.parseInt(scan.nextLine());
        if (kilograms <= 10) {
            priceAbove20 = priceAbove20 * 0.2;
        } else if (kilograms <= 20) {
            priceAbove20 = priceAbove20 * 0.5;
        }
        if (days > 30) {
            priceAbove20 = priceAbove20  + priceAbove20 * 0.1;
        } else if (days >= 7) {
            priceAbove20 = priceAbove20  + priceAbove20 * 0.15;
        } else {
            priceAbove20 = priceAbove20  + priceAbove20 * 0.4;
        }
        priceAbove20 = priceAbove20 * bags;
        System.out.printf("The total price of bags is: %.2f lv.", priceAbove20);
    }
}
