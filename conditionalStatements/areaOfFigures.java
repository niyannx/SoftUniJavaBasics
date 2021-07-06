package conditionalStatements;

import java.util.Scanner;

public class areaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String figure = scan.nextLine();

        if (figure.equals("square")) {
            double side = Double.parseDouble(scan.nextLine());

            System.out.printf("%.3f", side * side);

        } if (figure.equals("circle")) {
            double radius = Double.parseDouble(scan.nextLine());

            System.out.printf("%.3f", Math.PI*(radius*radius));

        } if (figure.equals("rectangle")) {
            double length = Double.parseDouble(scan.nextLine());
            double width = Double.parseDouble(scan.nextLine());

            System.out.printf("%.3f", width * length);

        } if  (figure.equals("triangle")) {
            double base = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());

            System.out.printf("%.3f", (base*height)/2);
        }
    }
}
