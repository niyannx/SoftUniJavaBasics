package conditionalStatements;

import java.util.Scanner;

public class pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int kgFood = Integer.parseInt(scan.nextLine());
        double kgDog = Double.parseDouble(scan.nextLine());
        double kgCat = Double.parseDouble(scan.nextLine());
        double gTurtle = Double.parseDouble(scan.nextLine());

        double foodNeeded = kgDog * days + kgCat * days + (gTurtle * 0.001) * days;
        if (foodNeeded > kgFood) {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNeeded - kgFood));
        } else {
            System.out.printf("%.0f kilos of food left.", Math.floor(kgFood - foodNeeded));
        }
    }
}
