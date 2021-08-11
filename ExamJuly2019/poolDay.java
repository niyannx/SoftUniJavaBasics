package ExamJuly2019;

import java.util.Scanner;

public class poolDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        double entranceTax = Double.parseDouble(scan.nextLine());
        double loungeTax = Double.parseDouble(scan.nextLine());
        double umbrellaTax = Double.parseDouble(scan.nextLine());

        double price;
        double peopleLounge;
        double peopleUmbrella;
        peopleUmbrella = Math.ceil(people / 2.00);
        peopleLounge = Math.ceil(people * 0.75);

        price = people * entranceTax;

        price = price + peopleLounge * loungeTax;
        price = price + peopleUmbrella * umbrellaTax;

        System.out.printf("%.2f lv.", price);
    }
}
