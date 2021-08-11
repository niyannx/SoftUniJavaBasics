/*Напишете конзолна програма, която чете име на град (текст) и обем на продажби (реално число) , въведени
от потребителя, и изчислява и извежда размера на търговската комисионна според горната таблица.
Резултатът да се изведе форматиран до 2 цифри след десетичната точка. При невалиден град или обем на
продажбите (отрицателно число) да се отпечата &quot;error&quot;.*/

package advancedConditionals;

import java.util.Scanner;

public class tradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String location = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());

        if (sales < 0){
            System.out.println("error");
        } else if (sales >= 0 && sales <= 500) {
            switch (location){
                case "Sofia":
                    System.out.printf("%.2f", sales * 0.05);
                    break;
                case "Varna":
                    System.out.printf("%.2f", sales * 0.045);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", sales * 0.055);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sales <= 1000) {
            switch (location){
                case "Sofia":
                    System.out.printf("%.2f", sales * 0.07);
                    break;
                case "Varna":
                    System.out.printf("%.2f", sales * 0.075);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", sales * 0.08);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sales <= 10000) {
            switch (location){
                case "Sofia":
                    System.out.printf("%.2f", sales * 0.08);
                    break;
                case "Varna":
                    System.out.printf("%.2f", sales * 0.10);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", sales * 0.12);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else {
            switch (location){
                case "Sofia":
                    System.out.printf("%.2f", sales * 0.12);
                    break;
                case "Varna":
                    System.out.printf("%.2f", sales * 0.13);
                    break;
                case "Plovdiv":
                    System.out.printf("%.2f", sales * 0.145);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
    }
}
