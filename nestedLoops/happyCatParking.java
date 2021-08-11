package nestedLoops;

import java.util.Scanner;

public class happyCatParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        double total = 0;
        double dailyTax;
        double currTax;

        for (int currDay = 1; currDay <= days; currDay++) {
            dailyTax = 0;
            for (int currHour = 1; currHour <= hours; currHour++) {
                if (currHour % 2 == 0 && currDay % 2 != 0) {
                    currTax = 1.25;
                } else if (currHour % 2 != 0 && currDay % 2 == 0) {
                    currTax = 2.50;
                } else {
                    currTax = 1;
                }
                dailyTax = dailyTax + currTax;
            }
            total = total + dailyTax;
            System.out.printf("Day: %d - %.2f leva\n", currDay, dailyTax);
        }
        System.out.printf("Total: %.2f leva", total);
    }
}
