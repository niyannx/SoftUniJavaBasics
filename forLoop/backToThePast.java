package forLoop;

import java.util.Scanner;

public class backToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        int year = Integer.parseInt(scan.nextLine());
        double moneySpent = 0;
        int hisYears = 18;

        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                moneySpent = moneySpent + 12000;
            } else {
                moneySpent = moneySpent + 12000 + 50 * hisYears;
            }
            hisYears++;
        }

        if (moneySpent > money) {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneySpent - money));
        } else {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", Math.abs(moneySpent - money));
        }
    }
}
