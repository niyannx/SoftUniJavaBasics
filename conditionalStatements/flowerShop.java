package conditionalStatements;

import java.util.Scanner;

public class flowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int magnolias = Integer.parseInt(scan.nextLine());
        int cinths = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int cacti = Integer.parseInt(scan.nextLine());
        double money = Double.parseDouble(scan.nextLine());

        double overallPrice = magnolias * 3.25 + cinths * 4 + roses * 3.5 + cacti * 8;
        overallPrice = overallPrice - overallPrice * 0.05;

        if (money < overallPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(overallPrice - money));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(money - overallPrice));
        }
    }
}
