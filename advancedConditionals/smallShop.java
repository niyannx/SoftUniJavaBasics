/*Предприемчив българин отваря квартални магазинчета в няколко града и продава на различни цени:
Напишете програма, която чете продукт (низ), град (низ) и количество (десетично число), въведени от
потребителя, и пресмята и отпечатва колко струва съответното количество от избрания продукт в посочения
град.
таблица :
град / продукт coffee water beer sweets peanuts
Sofia 0.50 0.80 1.20 1.45 1.60
Plovdiv 0.40 0.70 1.15 1.30 1.50
Varna 0.45 0.70 1.10 1.35 1.55*/

package advancedConditionals;

import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String location = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        if (location.equals("Sofia")) {
            switch (product) {
                case "coffee" :
                    System.out.println(0.5 * quantity);
                    break;
                case "water" :
                    System.out.println(0.8 * quantity);
                    break;
                case "beer" :
                    System.out.println(1.2 * quantity);
                    break;
                case "sweets" :
                    System.out.println(1.45 * quantity);
                    break;
                case "peanuts" :
                    System.out.println(1.6 * quantity);
                    break;
            }
        }

        if (location.equals("Plovdiv")) {
            switch (product) {
                case "coffee" :
                    System.out.println(0.40 * quantity);
                    break;
                case "water" :
                    System.out.println(0.70 * quantity);
                    break;
                case "beer" :
                    System.out.println(1.15 * quantity);
                    break;
                case "sweets" :
                    System.out.println(1.30 * quantity);
                    break;
                case "peanuts" :
                    System.out.println(1.50 * quantity);
                    break;
            }
        }

        if (location.equals("Varna")) {

            switch (product) {
                case "coffee" :
                    System.out.println(0.45 * quantity);
                    break;
                case "water" :
                    System.out.println(0.70 * quantity);
                    break;
                case "beer" :
                    System.out.println(1.10 * quantity);
                    break;
                case "sweets" :
                    System.out.println(1.35 * quantity);
                    break;
                case "peanuts" :
                    System.out.println(1.55 * quantity);
                    break;
            }
        }
    }
}
