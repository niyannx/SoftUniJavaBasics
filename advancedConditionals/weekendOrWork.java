/*Напишете програма която, чете ден от седмицата (текст), на английски език - въведен от потребителя. Ако
денят е работен отпечатва на конзолата - &quot;Working day&quot;, ако е почивен - &quot;Weekend&quot;. Ако се въведе текст
различен от ден от седмицата да се отпечата - &quot;Error&quot;.*/

package advancedConditionals;

import java.util.Scanner;

public class weekendOrWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
