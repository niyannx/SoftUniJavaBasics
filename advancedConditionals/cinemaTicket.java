/*Да се напише програма която чете ден от седмицата (текст) – въведен от потребителя и принтира на
конзолата цената на билет за кино според деня от седмицата:*/

package advancedConditionals;

import java.util.Scanner;

public class cinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();

        switch (day) {
            case "Monday" :
            case "Tuesday" :
            case "Friday" :
                System.out.println(12);
                break;
            case "Wednesday" :
            case "Thursday" :
                System.out.println(14);
                break;
            case "Saturday" :
            case "Sunday" :
                System.out.println(16);
                break;
        }
    }
}
