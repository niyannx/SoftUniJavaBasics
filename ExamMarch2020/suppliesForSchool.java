package ExamMarch2020;

import java.util.Scanner;

public class suppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pens = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        double liters = Double.parseDouble(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());

        double price = pens * 5.80 + markers * 7.20 + liters * 1.20;
        price = price - price * discount / 100;

        System.out.printf("%.3f", price);
    }
}
