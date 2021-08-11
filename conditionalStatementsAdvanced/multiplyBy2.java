package conditionalStatementsAdvanced;

import java.util.Scanner;

public class multiplyBy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double input = Double.parseDouble(scan.nextLine());

        while (input >= 0) {
            double result = input * 2;
            System.out.printf("Result: %.2f\n", result);
            input = Double.parseDouble(scan.nextLine());
        }
        System.out.println("Negative number!");
    }
}
