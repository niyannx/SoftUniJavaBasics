package firstSteps;

import java.util.Scanner;

public class circleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = Double.parseDouble(scan.nextLine());
        double area = Math.PI * Math.pow(r, 2);
        double perimeter = 2 * Math.PI * r;

        System.out.printf("%.2f\n%.2f", area, perimeter);
    }
}
