package forLoop;

import java.util.Scanner;

public class gameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double result = 0;
        double invalid = 0;
        double to10 = 0;
        double to20 = 0;
        double to30 = 0;
        double to40 = 0;
        double to50 = 0;

        for (int i = 0; i < n; i++) {
            int points = Integer.parseInt(scan.nextLine());

            if (points < 0 || points > 50) {
                result = result / 2;
                invalid++;
            } else if (points < 10) {
                result = result + points * 0.2;
                to10++;
            } else if (points < 20) {
                result = result + points * 0.3;
                to20++;
            } else if (points < 30) {
                result = result + points * 0.4;
                to30++;
            } else if (points < 40) {
                result = result + 50;
                to40++;
            } else {
                result = result + 100;
                to50++;
            }
        }

        to10 = to10 / n * 100;
        to20 = to20 / n * 100;
        to30 = to30 / n * 100;
        to40 = to40 / n * 100;
        to50 = to50 / n * 100;
        invalid = invalid / n * 100;

        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n", to10);
        System.out.printf("From 10 to 19: %.2f%%\n", to20);
        System.out.printf("From 20 to 29: %.2f%%\n", to30);
        System.out.printf("From 30 to 39: %.2f%%\n", to40);
        System.out.printf("From 40 to 50: %.2f%%\n", to50);
        System.out.printf("Invalid numbers: %.2f%%\n", invalid);

    }
}
