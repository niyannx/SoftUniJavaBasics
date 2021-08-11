package conditionalStatements;

import java.util.Scanner;

public class transportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kilometers = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();
        double price;
        double tax = 0;

        if (kilometers < 20) {
            tax = 0.70;
            if (time.equals("day")){
                price = 0.79;
            } else {
                price = 0.90;
            }
        } else if (kilometers < 100) {
            price = 0.09;
        } else {
            price = 0.06;
        }
        price = price * kilometers + tax;
        System.out.printf("%.2f", price);
    }
}
