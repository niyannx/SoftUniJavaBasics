/*Да се напише програма, която проверява дали въведеното от потребителя число е в интервала [-100, 100] и е
различно от 0 и извежда &quot;Yes&quot;, ако отговаря на условията, или &quot;No&quot; ако е извън тях.*/

package advancedConditionals;

import java.util.Scanner;

public class numberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        if (num <= 100 && num >= -100 && num != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
