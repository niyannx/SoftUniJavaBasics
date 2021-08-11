package conditionalStatements;

import java.util.Scanner;

public class fuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fuelType = scan.nextLine();
        int liters = Integer.parseInt(scan.nextLine());

        if (fuelType.equals("Diesel") || fuelType.equals("Gas") || fuelType.equals("Gasoline")) {
            if (liters >= 25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
