package whileLoop;

import java.util.Scanner;

public class reportSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int counter = 0;
        int peopleCash = 0;
        int peopleCredit = 0;
        double moneyCash = 0;
        double moneyCredit = 0;
        int allMoneyCollected = 0;

        while (!input.equals("End")) {
            int priceProduct = Integer.parseInt(input);
            counter++;

            if (counter % 2 == 1) {
                if (priceProduct > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    peopleCash++;
                    moneyCash = moneyCash + priceProduct;
                    allMoneyCollected = allMoneyCollected + priceProduct;
                }
            } else {
                if (priceProduct < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    peopleCredit++;
                    moneyCredit = moneyCredit + priceProduct;
                    allMoneyCollected = allMoneyCollected + priceProduct;
                }
            }
            if (allMoneyCollected >= sum) {
                System.out.printf("Average CS: %.2f\n", moneyCash / peopleCash);
                System.out.printf("Average CC: %.2f", moneyCredit / peopleCredit);
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
