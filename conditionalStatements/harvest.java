package conditionalStatements;

import java.util.Scanner;

public class harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = Integer.parseInt(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        int z = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double wine = ((x * y) / 2.5) * 0.4;
        if (wine >= z) {
            double winePerPerson = Math.ceil((wine - z) / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wine - z), winePerPerson);
        } else {
            double needed = Math.floor(z - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", needed);
        }

    }
}
