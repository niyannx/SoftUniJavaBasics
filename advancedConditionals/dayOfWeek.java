/*Напишете програма, която чете цяло число, въведено от потребителя, и отпечатва ден от седмицата (на
английски език), в граници [1...7] или отпечатва &quot;Error&quot; в случай, че въведеното число е невалидно.*/

package advancedConditionals;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }
    }
}
