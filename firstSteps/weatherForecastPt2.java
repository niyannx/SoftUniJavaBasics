package firstSteps;

import java.util.Scanner;

public class weatherForecastPt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double degrees = Double.parseDouble(scan.nextLine());
        if (degrees >= 26 && degrees <= 35) {
            System.out.println("Hot");
        } else if (degrees > 20) {
            System.out.println("Warm");
        } else if (degrees >= 15) {
            System.out.println("Mild");
        } else if (degrees >= 12) {
            System.out.println("Cool");
        } else if (degrees >= 5) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}
