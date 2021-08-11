package firstSteps;

import java.util.Scanner;

public class vegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scan.nextLine());
        double priceFruit = Double.parseDouble(scan.nextLine());
        int kgVegetables = Integer.parseInt(scan.nextLine());
        int kgFruit = Integer.parseInt(scan.nextLine());

        double fullPrice = (priceVegetables * kgVegetables + priceFruit * kgFruit) / 1.94;
        System.out.printf("%.2f", fullPrice);
    }
}
