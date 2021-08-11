/*Напишете програма, която чете от конзолата плод (banana / apple / orange / grapefruit / kiwi /
pineapple / grapes), ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday /
Saturday / Sunday) и количество (десетично число) , въведени от потребителя, и пресмята цената споредцените от таблиците по-горе. При невалиден ден от седмицата или невалидно име на плод да се отпечата
&quot;error&quot;.*/

package advancedConditionals;
import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        if (day.equals("Saturday") || day.equals("Sunday")){
            switch (fruit) {
                case "banana":
                    System.out.printf("%.2f", 2.70*quantity);
                    break;
                case "apple":
                    System.out.printf("%.2f", 1.25*quantity);
                    break;
                case "orange":
                    System.out.printf("%.2f", 0.90*quantity);
                    break;
                case "grapefruit":
                    System.out.printf("%.2f", 1.60*quantity);
                    break;
                case "kiwi":
                    System.out.printf("%.2f", 3.0*quantity);
                    break;
                case "pineapple":
                    System.out.printf("%.2f", 5.6*quantity);
                    break;
                case "grapes":
                    System.out.printf("%.2f", 4.2*quantity);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }

        else if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {

            switch (fruit) {
                case "banana":
                    System.out.printf("%.2f", 2.50*quantity);
                    break;
                case "apple":
                    System.out.printf("%.2f", 1.20*quantity);
                    break;
                case "orange":
                    System.out.printf("%.2f", 0.85*quantity);
                    break;
                case "grapefruit":
                    System.out.printf("%.2f", 1.45*quantity);
                    break;
                case "kiwi":
                    System.out.printf("%.2f", 2.70*quantity);
                    break;
                case "pineapple":
                    System.out.printf("%.2f", 5.50*quantity);
                    break;
                case "grapes":
                    System.out.printf("%.2f", 3.85*quantity);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else {
            System.out.println("error");
        }
    }
}
