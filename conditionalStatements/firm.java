package conditionalStatements;

import java.util.Scanner;

public class firm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        double days = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double overallHoursNeeded = Math.floor((days - (days * 0.1)) * 8 + workers * 2 * days);
        if (overallHoursNeeded > hours) {
            System.out.printf("Yes!%.0f hours left.", overallHoursNeeded - hours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hours - overallHoursNeeded);
        }
    }
}
