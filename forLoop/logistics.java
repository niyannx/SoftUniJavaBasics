package forLoop;

import java.util.Scanner;

public class logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cargo = Integer.parseInt(scan.nextLine());
        double allTons = 0;
        double bus = 0;
        double truck = 0;
        double train = 0;

        for (int i = 1; i <= cargo; i++) {
            int tons = Integer.parseInt(scan.nextLine());
            allTons = allTons + tons;
            if (tons <= 3) {
                bus = bus + tons;
            } else if (tons <= 11) {
                truck = truck + tons;
            } else {
                train = train + tons;
            }
        }
        double average = (bus * 200 + truck * 175 + train * 120) / allTons;
        double busPercentage = bus / allTons * 100;
        double truckPercentage = truck / allTons * 100;
        double trainPercentage = train / allTons * 100;

        System.out.printf("%.2f\n", average);
        System.out.printf("%.2f%%\n", busPercentage);
        System.out.printf("%.2f%%\n", truckPercentage);
        System.out.printf("%.2f%%\n", trainPercentage);
    }
}
