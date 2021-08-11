package whileCycleExercise;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scan.nextLine());
        double money = Double.parseDouble(scan.nextLine());

        int spendDays = 0;
        int days = 0;

        while (money < moneyNeeded) {
            String status = scan.nextLine();
            double sum = Double.parseDouble(scan.nextLine());

            if (status.equals("spend")) {
                money -= sum;
                if (money < 0) {
                    money = 0;
                }

                spendDays++;
            }else if (status.equals("save")) {
                money += sum;
                spendDays = 0;
            }
            days++;
            if (spendDays == 5) {
                System.out.printf("You can't save the money.%n%d", days);

                break;
            }
        }
        if (money >= moneyNeeded) {
            System.out.printf("You saved the money for %s days.", days);
        }
    }
}
