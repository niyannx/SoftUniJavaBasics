package whileCycle;

import java.util.Scanner;

public class accountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double total = 0;

        while (!input.equals("NoMoreMoney")) {
            Double increase = Double.valueOf(input);

            if (increase < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                total = total + increase;
                System.out.printf("Increase: %.2f\n", increase);
                input = scan.nextLine();
            }
        }
        System.out.printf("Total: %.2f", total);
    }
}
