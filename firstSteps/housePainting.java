package firstSteps;

import java.util.Scanner;

public class housePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double wallsArea = (x * x * 2 - 2.4) + (x * y * 2 - 2 * 2.25);
        double greenPaint = wallsArea / 3.4;

        double roofArea = (x * y) * 2 + 2 * (x * h / 2);
        double redPaint = roofArea / 4.3;

        System.out.printf("%.2f\n%.2f", greenPaint, redPaint);
    }
}
