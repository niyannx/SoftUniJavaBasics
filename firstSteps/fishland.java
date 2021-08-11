package firstSteps;

import java.util.Scanner;

public class fishland {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double skumriyaPrice = Double.parseDouble(scan.nextLine());
        double tsatsaPrice = Double.parseDouble(scan.nextLine());

        double palamudPrice = skumriyaPrice + skumriyaPrice * 0.6;
        double safridPrice = tsatsaPrice + tsatsaPrice * 0.8;
        double midiPrice = 7.5;

        double palamudKg = Double.parseDouble(scan.nextLine());
        double safridKg = Double.parseDouble(scan.nextLine());
        double midiKg = Double.parseDouble(scan.nextLine());

        double fullPrice = safridPrice * safridKg + midiKg * midiPrice + palamudKg * palamudPrice;
        System.out.printf("%.2f", fullPrice);
    }
}
