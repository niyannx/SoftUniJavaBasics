package firstSteps;

import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = scanner.nextDouble();

        double fullPrice = area * 7.61;
        double discount = 0.18 * fullPrice;
        double finalPrice = fullPrice - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}