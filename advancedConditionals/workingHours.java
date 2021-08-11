/*Да се напише програма, която чете час от денонощието(цяло число) и ден от седмицата(текст) - въведени от
потребителя и проверява дали офисът на фирма е отворен, като работното време на офисът е от 10-18 часа,
от понеделник до събота включително*/

package advancedConditionals;

import java.util.Scanner;

public class workingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int time = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();

        if (time <= 18 && time >= 10 && !day.equals("Sunday")) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
