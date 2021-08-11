package ExamMarch2020;

import java.util.Scanner;

public class catWalking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minutesPerWalk = Integer.parseInt(scan.nextLine());
        int timesPerDay = Integer.parseInt(scan.nextLine());
        int caloriesPerDay = Integer.parseInt(scan.nextLine());

        int caloriesLost = 5 * minutesPerWalk * timesPerDay;

        if (caloriesLost >= (double)caloriesPerDay / 2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesLost);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesLost);
        }
    }
}
