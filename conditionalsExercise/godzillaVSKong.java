package conditionalsExercise;

import java.util.Scanner;

public class godzillaVSKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int extras = Integer.parseInt(scan.nextLine());
        double clothing = Double.parseDouble(scan.nextLine());

        clothing = extras * clothing;
        double decor = budget * 0.1;

        if (extras > 150) {
            clothing = clothing - clothing * 0.1;
        }

        if (decor + clothing > budget) {
            double shortage = (decor + clothing) - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", shortage);
        }
        if (decor + clothing <= budget) {
            double profit = budget - (decor + clothing) ;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", profit);
        }
    }
}
